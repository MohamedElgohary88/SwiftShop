package com.example.viewmodels.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.entities.error.NetworkException
import com.example.entities.error.NullResultException
import com.example.entities.error.ServerException
import com.example.entities.error.SwiftShopException
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

abstract class BaseViewModel<UiState : BaseUIState, UiEffect : BaseUiEffect>(initialState: UiState) :
    ViewModel() {

    protected val _state: MutableStateFlow<UiState> by lazy { MutableStateFlow(initialState) }
    val state = _state.asStateFlow()

    protected val _effect = MutableSharedFlow<UiEffect>()
    val effect = _effect.asSharedFlow()

    protected fun <T> tryToExecute(
        call: suspend () -> T,
        onSuccess: (T) -> Unit,
        onError: (Throwable) -> Unit,
        dispatcher: CoroutineDispatcher = Dispatchers.IO
    ) {
        viewModelScope.launch(dispatcher) {
            handleException(onError) {
                val result = call()
                onSuccess(result)
            }
        }
    }

    private suspend fun <T> handleException(
        onError: (Throwable) -> Unit,
        call: suspend () -> T
    ) {
        try {
            call()
        } catch (exception: Exception) {
            onError(exception)
        } catch (e: ServerException) {
            onError(e)
        } catch (e: NetworkException) {
            onError(e)
        } catch (e: NullResultException) {
            onError(e)
        } catch (e: SwiftShopException) {
            onError(e)
        } catch (throwable: Throwable) {
            onError(throwable)
        }
    }

    protected fun sendEffect(effect: UiEffect) {
        viewModelScope.launch(Dispatchers.IO) { _effect.emit(effect) }
    }
}


interface BaseUiEffect

interface BaseUIState
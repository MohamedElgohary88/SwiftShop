package com.example.local.datastore

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import com.example.local.util.Keys
import com.example.local.util.get
import com.example.repository.source.UserPreferencesDataSource
import javax.inject.Inject

class UserDataStoreDataSource @Inject constructor(
    private val dataStore: DataStore<Preferences>
) : UserPreferencesDataSource {

    override suspend fun setUserToken(token: String) {
        dataStore.edit { preferences ->
            preferences[Keys.token] = token
        }
    }

    override suspend fun getUserToken(): String? {
        return dataStore.get()[Keys.token]
    }

}
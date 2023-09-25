package com.example.remote.util.interceptor

import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val newRequest = request.newBuilder()
            .url(buildUrl(request))
            .build()
        return chain.proceed(newRequest)
    }

    private fun buildUrl(request: Request): HttpUrl {
        return request.url.newBuilder()
            .build()
    }
}
package vn.kietnguyendev.okhttppractice

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class LoggerInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request: Request = chain.request()
        val response = chain.proceed(request)
        when(response.code) {
            200 -> {
                println("KIET_DEBUG_Success")
            }
        }

        return response
    }
}
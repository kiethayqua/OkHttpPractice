package vn.kietnguyendev.okhttppractice

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    private const val BASE_URL = "https://5e510330f2c0d300147c034c.mockapi.io/"
    fun getRetrofit(): Retrofit {
        // create OkHttpClient
        val httpClient = OkHttpClient
            .Builder()
            .addInterceptor(LoggerInterceptor())
            .build()
        return Retrofit.Builder()
            .client(httpClient)
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val userApi: UserApi = getRetrofit().create(UserApi::class.java)
}
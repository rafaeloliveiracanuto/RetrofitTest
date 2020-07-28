package com.example.retrofittest

import retrofit2.Retrofit

class RetrofitClient private constructor() {

    companion object {
        private lateinit var retrofit: Retrofit
        private val BASE_URL = "https://jsonplaceholder.typicode.com/"

        fun getRetrofitInstance(): Retrofit {

            if (::retrofit.isInitialized) {
                retrofit = Retrofit.Builder()
                    .baseUrl()
                    .build()
            }

            return retrofit
        }

    }

}
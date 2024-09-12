package com.example.viacepng

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    val baseUrl = "https://viacep.com.br"

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            // precisamos adicionar uma fábrica de conversor para
            // converter o objeto JSON em objeto Java
            .build()
    }
}
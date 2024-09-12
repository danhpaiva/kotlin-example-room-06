package com.example.viacepng

import retrofit2.Response
import retrofit2.http.GET

interface ViaCepApi {
    @GET("/ws/01001000/json")
    suspend fun getEnderecos() : Response<Endereco>
}
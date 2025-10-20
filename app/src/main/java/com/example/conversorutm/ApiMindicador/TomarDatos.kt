package com.example.conversorutm.ApiMindicador

import com.example.conversorutm.Model.ValorMonetario
import retrofit2.http.GET

interface TomarDatos {

    data class InsertResponse(
        val success: Boolean,
        val message: String?
    )

    interface ApiListaUtm {
        @GET("https://mindicador.cl/api/utm")
        suspend fun getListaUtm(): List<ValorMonetario>
    }
}
package com.joincoded.bankapi.network

import com.joincoded.bankapi.data.AmountChange
import com.joincoded.bankapi.data.ProfileInfo
import com.joincoded.bankapi.data.User
import com.joincoded.bankapi.data.response.TokenResponse
import com.joincoded.bankapi.utils.Constants
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.PUT

interface GarageApiService {

    @POST(Constants.signupEndpoint)
    suspend fun signup(@Body user: User): Response<TokenResponse>

    @POST(Constants.signinEndpoint)
    suspend fun signin(@Body user: User): Response<TokenResponse>

    @GET("account")
    suspend fun getProfileInfo():List<ProfileInfo>

    @PUT(Constants.withdrawEndpoint)
    suspend fun withdraw(
        @Header(Constants.authorization) token: String?,
        @Body request: AmountChange
    ): Response<Unit>


}
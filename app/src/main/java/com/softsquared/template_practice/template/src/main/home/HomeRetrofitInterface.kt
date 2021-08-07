package com.softsquared.template_practice.template.src.main.home

import com.softsquared.template_practice.template.src.main.home.models.PostSignUpRequest
import com.softsquared.template_practice.template.src.main.home.models.SignUpResponse
import com.softsquared.template_practice.template.src.main.home.models.UserResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface HomeRetrofitInterface {
    @GET("/users")
    fun getUsers() : Call<UserResponse>

    @POST("/users")
    fun postSignUp(@Body params: PostSignUpRequest) : Call<SignUpResponse>
}

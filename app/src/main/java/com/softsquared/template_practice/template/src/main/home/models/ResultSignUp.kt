package com.softsquared.template_practice.template.src.main.home.models

import com.google.gson.annotations.SerializedName

data class ResultSignUp(
    @SerializedName("userId") val userId: Int,
    @SerializedName("jwt") val jwt: String
)
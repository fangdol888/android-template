package com.softsquared.template_practice.template.src.main.home

import com.softsquared.template_practice.template.src.main.home.models.SignUpResponse
import com.softsquared.template_practice.template.src.main.home.models.UserResponse

interface HomeFragmentView {

    fun onGetUserSuccess(response: UserResponse)
    fun onGetUserFailure(message: String)
    fun onPostSignUpSuccess(response: SignUpResponse)
    fun onPostSignUpFailure(message: String)
}
package com.softsquared.template_practice.template.src.main.myPage

import android.os.Bundle
import android.view.View
import com.softsquared.template_practice.R
import com.softsquared.template_practice.databinding.FragmentMyPageBinding
import com.softsquared.template_practice.template.config.BaseFragment

class MyPageFragment : BaseFragment<FragmentMyPageBinding>(FragmentMyPageBinding::bind, R.layout.fragment_my_page) {
    private var mCount = 0
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonChangeCounterText.setOnClickListener{
            binding.textViewCounter.text =
                resources.getString(R.string.my_page_tv_counter, ++mCount)
        }

    }
}
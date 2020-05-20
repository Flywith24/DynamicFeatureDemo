package com.flywith24.dynamicfeaturedemo.feature2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_feature2.*

class Feature2TwoFragment : Fragment(R.layout.fragment_feature2) {
    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        title.text = "Feature2Two"
    }
}
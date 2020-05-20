package com.flywith24.dynamicfeaturedemo.feature2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragmet_feature2.*

class Feature2OneFragment : Fragment(R.layout.fragmet_feature2) {
    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        title.text = "Feature2One"
    }
}
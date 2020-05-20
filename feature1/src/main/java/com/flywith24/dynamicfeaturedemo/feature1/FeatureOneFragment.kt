package com.flywith24.dynamicfeaturedemo.feature1

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_one.*

class FeatureOneFragment : Fragment(R.layout.fragment_one) {

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        title.text = "Feature1One"
        title.setOnClickListener {
            findNavController().navigate(R.id.action_featureOneFragment_to_fragmentTwoFragment)
        }
    }
}
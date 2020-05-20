package com.flywith24.feature1

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_feature1.*

/**
 * @author yyz (杨云召)
 * @date   2020/5/19
 * time   17:16
 * description
 */
class Feature1FragmentOne : Fragment(R.layout.fragment_feature1) {
    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        title.setText("Feature1FragmentOne")
    }
}
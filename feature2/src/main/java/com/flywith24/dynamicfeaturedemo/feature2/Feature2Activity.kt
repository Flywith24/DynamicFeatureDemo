package com.flywith24.dynamicfeaturedemo.feature2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_feature2.*

class Feature2Activity : AppCompatActivity(R.layout.activity_feature2) {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        content.text = "Feature2Activity"
    }
}
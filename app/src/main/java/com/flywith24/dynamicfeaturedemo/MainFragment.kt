package com.flywith24.dynamicfeaturedemo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * @author yyz (杨云召)
 * @date   2020/5/19
 * time   17:33
 * description
 */
class MainFragment:Fragment(R.layout.fragment_main) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        main.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_featureOneFragment)
        }
    }
}
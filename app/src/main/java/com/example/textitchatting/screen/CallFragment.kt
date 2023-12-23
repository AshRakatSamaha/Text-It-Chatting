package com.example.textitchatting.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.textitchatting.R
import com.example.textitchatting.databinding.BottomNavFragmentCallBinding


class CallFragment : Fragment() {
  private lateinit var binding: BottomNavFragmentCallBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     binding= BottomNavFragmentCallBinding.inflate(layoutInflater)
        return binding.root

    }


}
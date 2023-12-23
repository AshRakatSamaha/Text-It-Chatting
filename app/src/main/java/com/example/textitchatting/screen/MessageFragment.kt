package com.example.textitchatting.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.textitchatting.R
import com.example.textitchatting.databinding.BottomNavFragmentMessageBinding


class MessageFragment : Fragment() {
    private lateinit var binding: BottomNavFragmentMessageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BottomNavFragmentMessageBinding.inflate(layoutInflater)
        return binding.root
    }


}


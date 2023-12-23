package com.example.textitchatting.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.textitchatting.databinding.BottomNavFragmentSettingsBinding


class SettingsFragment : Fragment() {
  private lateinit var binding: BottomNavFragmentSettingsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= BottomNavFragmentSettingsBinding.inflate(layoutInflater)
        return binding.root
    }


}
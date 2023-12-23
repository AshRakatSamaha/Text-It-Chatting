package com.example.textitchatting.auth

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.textitchatting.R
import com.example.textitchatting.databinding.AuthFragmentLogInBinding


class LogInFragment : Fragment() {
    private lateinit var binding: AuthFragmentLogInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = AuthFragmentLogInBinding.inflate(layoutInflater)
        initViews()

        return binding.root
    }


    private fun initViews() {
        callbackButton()
    }

    private fun callbackButton() {

        binding.btnLogin.setOnClickListener {
         findNavController().navigate(R.id.action_logInFragment_to_homeFragment)
        }

    }


}
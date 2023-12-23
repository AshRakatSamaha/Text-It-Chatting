package com.example.textitchatting.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.textitchatting.databinding.AuthFragmentSignUpBinding



class SignUpFragment : Fragment() {
private lateinit var binding: AuthFragmentSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= AuthFragmentSignUpBinding.inflate(layoutInflater)
        return binding.root
    }


}
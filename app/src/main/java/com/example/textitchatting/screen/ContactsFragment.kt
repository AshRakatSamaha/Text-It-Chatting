package com.example.textitchatting.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.textitchatting.databinding.BottomNavFragmentContactsBinding


class ContactsFragment : Fragment() {
    private lateinit var binding: BottomNavFragmentContactsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BottomNavFragmentContactsBinding.inflate(layoutInflater)
        return binding.root
    }


}
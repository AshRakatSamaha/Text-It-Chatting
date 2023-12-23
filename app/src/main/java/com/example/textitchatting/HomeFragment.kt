package com.example.textitchatting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.textitchatting.adapter.MyPagerAdapter
import com.example.textitchatting.databinding.FragmentHomeBinding
import com.example.textitchatting.screen.CallFragment
import com.example.textitchatting.screen.ContactsFragment
import com.example.textitchatting.screen.MessageFragment
import com.example.textitchatting.screen.SettingsFragment
import com.example.textitchatting.ui.BottomSheetFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var viewPager: ViewPager2
    private var fragments = listOf(
        MessageFragment(), CallFragment(), ContactsFragment(), SettingsFragment()
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        initBottomNavigation()
        //showBottomSheetDialog()
        return binding.root
    }

    private fun showBottomSheet() {
        val bottomSheetFragment = BottomSheetFragment()
        bottomSheetFragment.show(parentFragmentManager, bottomSheetFragment.tag)
    }

    private fun initBottomNavigation() {
        viewPager = binding.viewPager
        bottomNavigationView = binding.bottomNavigation
        val adapter = MyPagerAdapter(childFragmentManager, fragments, lifecycle)
        binding.viewPager.adapter = adapter


        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.messageFragment -> {
                    viewPager.currentItem = 0
                  //  showBottomSheet()
                }
                R.id.callFragment -> viewPager.currentItem = 1
                R.id.contactsFragment -> viewPager.currentItem = 2
                R.id.settingsFragment -> viewPager.currentItem = 3
            }
            true
        }

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                bottomNavigationView.menu.getItem(position).isChecked = true
            }
        })

        return Unit
    }

}
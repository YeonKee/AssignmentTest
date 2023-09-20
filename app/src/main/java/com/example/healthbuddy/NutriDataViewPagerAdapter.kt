package com.example.healthbuddy

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.healthbuddy.fragment.AnalysisExecFragment
import com.example.healthbuddy.fragment.SuggestExecFragment

class NutriDataViewPagerAdapter(fragmentActivity: FragmentActivity) :
        FragmentStateAdapter(fragmentActivity) {
        override fun createFragment(position: Int): Fragment {
                return when (position) {
                        0 -> AnalysisExecFragment()
                        1 -> SuggestExecFragment()
                        2 -> AnalysisExecFragment()
                        else -> AnalysisExecFragment()
                }
        }

        override fun getItemCount(): Int {
                return 3
                }
        }
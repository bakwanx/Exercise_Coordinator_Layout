package com.finalproject.exercisecoordinatorlayout

import android.R
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter


class SamplePageAdapter(activity: MainActivity): FragmentStateAdapter(activity) {


    override fun getItemCount(): Int  = 2

    override fun createFragment(position: Int): Fragment {
        return if (position == 0) {
            FragmentOne()
        } else {
            FragmentTwo()
        }
    }




}
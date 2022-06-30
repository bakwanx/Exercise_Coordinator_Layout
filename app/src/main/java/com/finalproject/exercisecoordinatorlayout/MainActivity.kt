package com.finalproject.exercisecoordinatorlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val demoCollectionPagerAdapter = SamplePageAdapter(this)
        val viewPager = findViewById<ViewPager2>(R.id.vp_landing)


        viewPager.adapter = demoCollectionPagerAdapter

        val tabLayout = findViewById<TabLayout>(R.id.tl_landing)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = "LABEL ${(position + 1)}"
        }.attach()
    }
}
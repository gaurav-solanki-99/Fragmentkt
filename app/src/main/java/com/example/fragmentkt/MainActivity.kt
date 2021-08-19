package com.example.fragmentkt

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   var adapter:MyPagerAdapter?=null
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding!!.root)
        supportActionBar!!.hide()


        adapter= MyPagerAdapter(supportFragmentManager)
//        binding!!.ll.adapter = adapter
//        binding!!.tabLayout.setupWithViewPager(binding!!.ll)
//

        binding!!.ll.adapter=adapter
        binding!!.tabLayout.setupWithViewPager(binding!!.ll)

    }
}
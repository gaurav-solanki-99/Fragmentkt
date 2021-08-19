package com.example.fragmentkt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentkt.databinding.Tab2Binding

class Tab2 : Fragment() {


    private var binding:Tab2Binding?=null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding= Tab2Binding.inflate(LayoutInflater.from(activity))



        return binding!!.root
    }
}
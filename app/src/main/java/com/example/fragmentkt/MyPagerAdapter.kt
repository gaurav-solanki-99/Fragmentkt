package com.example.fragmentkt

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter(manager:FragmentManager) : FragmentPagerAdapter(manager) {


    override fun getItem(position: Int): Fragment {


        var fragment : Fragment?=null

        if(position==0)
        {
            fragment=Tab1()

        }
        else if(position==1)
        {
            fragment=Tab2()

        }
        else if(position==2)
        {
            fragment=Tab3()

        }


        return fragment!!




    }

    override fun getCount(): Int {


        return  3



    }

    override fun getPageTitle(position: Int): CharSequence? {
        var tabtitle:String=""

        if(position==0)
        {
          tabtitle="Tab1"
        }
        else if(position==1)
        {
            tabtitle="Tab2"
        }
        else if(position==2)
        {
            tabtitle="Tab3"
        }


        return tabtitle
    }
}
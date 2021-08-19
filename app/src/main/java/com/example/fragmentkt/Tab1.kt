package com.example.fragmentkt

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fragmentkt.databinding.Tab1Binding
import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Tab1 : Fragment() {


    private var binding : Tab1Binding? =null
    var al:ArrayList<Projects>?=null
    var adapter:ProjectsAdapter?=null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        binding= Tab1Binding.inflate(LayoutInflater.from(activity))







      ApiInterface.getUserApiInstance()?.getData("Basic ZWU3NDM1NTk2Yjg4NDI2YTgzZDliNmViY2MyNDgyZDg6MzEwZjYwNTE1NGZmNDg1MWI2OTY2NWY2YTcyYTM4Y2U=")?.enqueue(object : Callback<ResponseBody> {
          override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
           Log.e("OnFailure >>>"," =="+t.message)
          }

          override fun onResponse(
              call: Call<ResponseBody>,
              response: Response<ResponseBody>
          ) {
              Log.e("Responce code ",""+response.code())
              Log.e("Responce body ",""+response.body())

              if(response.code()==200)
              {
                  al = java.util.ArrayList()

                  try {
                      val result = response.body()!!.string()
                      val res = response.body()!!.string()
                      Toast.makeText(activity, response.body()!!.string(), Toast.LENGTH_SHORT)
                          .show()
                      println(
                          "Successfully get Data : " + response.body()!!.string().trim { it <= ' ' }
                      )
                      println("url =====> $result")
                      val obj = JSONObject(result)
                      val arr = obj.getJSONArray("projects")
                      for (i in 0 until arr.length()) {
                          val obj2 = arr.getJSONObject(i)
                          val id = obj2.getString("id")
                          val name = obj2.getString("name")
                          val status = obj2.getInt("status")
                          val sign_key = obj2.getString("sign_key")
                          val vendor_key = obj2.getString("vendor_key")
                          val recording_server = obj2.getString("recording_server")
                          val created = obj2.getInt("created")
                          val projects = Projects()
                          projects.id = id
                          projects.name = name
                          projects.created = "" + created
                          projects.recording_server = recording_server
                          projects.sign_key = sign_key
                          projects.status = "" + status
                          projects.vendor_key = vendor_key
                          al!!.add(projects)
                          println(
                              "Name " + obj2.getString("name") + obj2.getInt("created") + al!![i].id
                          )
                      }


                      adapter= activity?.applicationContext?.let { ProjectsAdapter(it,al) }

                      binding!!.rv.layoutManager = LinearLayoutManager(activity)

                      binding!!.rv.adapter= adapter


                  } catch (e: Exception) {
                      e.printStackTrace()
                      println("  Exception >>>>>>>>>>>>>>>" + e.message)
                  }




              }






          }
      })


        return binding!!.root
    }


}
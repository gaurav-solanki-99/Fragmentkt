package com.example.fragmentkt

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header

object ApiInterface {


    private var userApiInstance:UserApi?=null

    fun getUserApiInstance():UserApi?
    {
        if(userApiInstance==null)
        {
            var retrofit:Retrofit=Retrofit.Builder()
                .baseUrl("https://api.agora.io")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            userApiInstance=retrofit.create(UserApi::class.java)

        }
        return userApiInstance
    }
}

interface UserApi {
//    @GET("/dev/v1/projects")
//    fun getData(@Header("Authorization") user: String?): Call<ResponseBody?>?

    @GET("/dev/v1/projects")
     fun getData(@Header("Authorization")user:String):Call<ResponseBody>
}
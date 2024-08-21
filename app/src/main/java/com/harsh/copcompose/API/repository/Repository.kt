package com.harsh.copcompose.API.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.harsh.copcompose.API.ApiInterface
import com.harsh.copcompose.API.RetrofitInstance
import com.harsh.copcompose.Model.HeadBannerModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(private val apiService: ApiInterface) {
    suspend fun getBanner(type:String): HeadBannerModel? {
        val response = apiService.getBanner(type)
        return if (response.isSuccessful) {
            response.body()
        } else {
            null
        }
    }
}
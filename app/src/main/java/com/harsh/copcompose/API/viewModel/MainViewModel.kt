package com.harsh.copcompose.API.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.harsh.copcompose.API.repository.Repository
import com.harsh.copcompose.Model.HeadBannerModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    private val repository = Repository()

    private val _data = MutableLiveData<HeadBannerModel>()
    val data: LiveData<HeadBannerModel> get() = _data


    fun getHeader(type:String) {
        viewModelScope.launch {
            _data.value = repository.getBanner(type).value
        }
    }
}
package com.harsh.copcompose.API.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.harsh.copcompose.API.repository.Repository
import com.harsh.copcompose.Model.HeadBannerModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    private val _banner = MutableStateFlow<HeadBannerModel?>(null)
    val banner: StateFlow<HeadBannerModel?> get() = _banner

    fun fetchBanner(type:String) {
        viewModelScope.launch {
            val userResponse = repository.getBanner(type)
            _banner.value = userResponse
        }
    }
}
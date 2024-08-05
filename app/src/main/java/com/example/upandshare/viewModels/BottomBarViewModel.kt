package com.example.upandshare.viewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BottomBarViewModel : ViewModel() {
    var selectedButton by mutableIntStateOf(0)
}
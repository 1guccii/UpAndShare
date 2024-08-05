package com.example.upandshare.viewModels

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.upandshare.untils.FirebaseFileDownloader
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FolderScreenViewModel(context: Context): ViewModel() {
    private val downloadFirebase by lazy {   FirebaseFileDownloader(context) }

    fun downloadImage(fileName: String) {
        CoroutineScope(Dispatchers.Main).launch {
            downloadFirebase.downloadFile(fileName)
        }
    }
}
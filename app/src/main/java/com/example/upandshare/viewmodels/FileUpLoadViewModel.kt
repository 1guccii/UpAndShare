package com.example.upandshare.viewmodels

import android.net.Uri
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.upandshare.untils.FirebaseStorageHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FileUpLoadViewModel : ViewModel() {

    private val firebaseStorageHelper =  FirebaseStorageHelper()

    private val _uploadStatus = MutableLiveData<Result<Uri>>()
    val uploadStatus: LiveData<Result<Uri>>
        get() = _uploadStatus

    fun uploadFile(fileUri: Uri) = CoroutineScope(Dispatchers.IO).launch {
        firebaseStorageHelper.upLoadFile(
            fileUri,
            onSuccess = { uri ->
                _uploadStatus.postValue(Result.success(uri))
            },
            onFailure = { exception ->
                _uploadStatus.postValue(Result.failure(exception))
                }
        )
    }
    
}
package com.example.upandshare.untils

import android.net.Uri
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.google.firebase.storage.UploadTask
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FirebaseStorageHelper {

    private val storage : FirebaseStorage = FirebaseStorage.getInstance()
    private val storageRef : StorageReference = storage.reference

    fun upLoadFile(fileUri: Uri, onSuccess: (Uri) -> Unit, onFailure: (Exception) -> Unit) {
        CoroutineScope(Dispatchers.IO).launch {

        val fileRef = storageRef.child("uploads/${fileUri.lastPathSegment}")

        val uploadTask: UploadTask = fileRef.putFile(fileUri)

//        Up load file đã chọn
        uploadTask.addOnSuccessListener { taskSnapShot ->
            fileRef.downloadUrl.addOnSuccessListener { uri ->
                onSuccess(uri)
            }.addOnFailureListener { exception ->
                onFailure(exception)
            }
        }.addOnFailureListener { exception ->
            onFailure(exception)
        }
//        Theo dõi quá  trình upload
        uploadTask.addOnProgressListener { taskSnapshot ->
            val progress = (100.0 * taskSnapshot.bytesTransferred / taskSnapshot.totalByteCount)
            println("Upload is $progress% done")
        }.addOnPausedListener {
            println("Upload is paused")
            }
        }
    }
}
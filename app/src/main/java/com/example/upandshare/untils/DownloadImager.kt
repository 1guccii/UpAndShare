package com.example.upandshare.untils

import android.Manifest
import android.app.Activity
import android.content.ContentValues
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import java.io.File


class FirebaseFileDownloader(private val context: Context) {
    val REQUEST_CODE_STORAGE_PERMISSION = 100

    private val storageRef: StorageReference = FirebaseStorage.getInstance().reference

    fun downloadFile(filePath: String) {
        if (ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE)
            != PackageManager.PERMISSION_GRANTED) {
            // Yêu cầu quyền lưu trữ
            ActivityCompat.requestPermissions(context as Activity,
                arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), REQUEST_CODE_STORAGE_PERMISSION)
        } else {
            // Quyền đã được cấp, thực hiện tải tệp
            val fileReference = storageRef.child(filePath)
            fileReference.getBytes(Long.MAX_VALUE).addOnSuccessListener { bytes ->
                try {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        saveFileToGalleryQAndAbove(bytes)
                    } else {
                        saveFileToGalleryLegacy(bytes)
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                    Toast.makeText(context, "Error saving file: ${e.message}", Toast.LENGTH_SHORT).show()
                }
            }.addOnFailureListener { exception ->
                Toast.makeText(context, "Download failed: ${exception.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun saveFileToGalleryQAndAbove(bytes: ByteArray) {
        val values = ContentValues().apply {
            put(MediaStore.Images.Media.DISPLAY_NAME, "giai_tich_3.jpg")
            put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg")
            put(MediaStore.Images.Media.RELATIVE_PATH, Environment.DIRECTORY_PICTURES )
        }

        val uri = context.contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values)
        uri?.let {
            try {
                context.contentResolver.openOutputStream(it).use { outputStream ->
                    outputStream?.write(bytes)
                    Toast.makeText(context, "File saved to gallery", Toast.LENGTH_SHORT).show()
                }
            } catch (e: Exception) {
                e.printStackTrace()
                Toast.makeText(context, "Error saving file: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun saveFileToGalleryLegacy(bytes: ByteArray) {
        val file = File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), "giai_tich_3.jpg")

        try {
            file.outputStream().use { outputStream ->
                outputStream.write(bytes)
                Toast.makeText(context, "File saved to Pictures folder", Toast.LENGTH_SHORT).show()
            }
        } catch (e: Exception) {
            e.printStackTrace()
            Toast.makeText(context, "Error saving file: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }
}
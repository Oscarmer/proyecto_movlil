package com.oscar.appmecstore.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oscar.appmecstore.model.Comments
import com.oscar.appmecstore.network.Callback
import com.oscar.appmecstore.network.FirestoreService
import java.lang.Exception

class CommentsViewModel: ViewModel() {
    val firestoreService = FirestoreService()
    val listComments : MutableLiveData<List<Comments>> = MutableLiveData()
    var isLoading = MutableLiveData<Boolean>()

    fun getCommentsFromFirebase() {
        firestoreService.getComments(object : Callback<List<Comments>> {
            override fun onSuccess(result: List<Comments>?) {
                listComments.postValue(result)
                processFinished()
            }

            override fun onFailed(exception: Exception) {
                processFinished()
            }
        })
    }

    fun processFinished() {
        isLoading.value = true
    }

    fun refresh() {
        getCommentsFromFirebase()
    }
}
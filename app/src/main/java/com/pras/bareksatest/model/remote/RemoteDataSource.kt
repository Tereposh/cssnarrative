package com.pras.bareksatest.model.remote

import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.pras.bareksatest.model.remote.response.DataResponse
import com.pras.bareksatest.utils.EspressoIdlingResource

class RemoteDataSource private constructor(private val jsonHelper: JsonHelper) {
    private val handler = Handler(Looper.getMainLooper())

    companion object {
        private const val SERVICE_LATENCY_IN_MILIS: Long = 2000

        @Volatile
        pri
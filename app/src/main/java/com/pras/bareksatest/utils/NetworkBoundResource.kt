package com.pras.bareksatest.utils

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.pras.bareksatest.model.remote.ApiResponse
import com.pras.bareksatest.model.remote.StatusResponse
import com.pras.bareksatest.vo.Resource

abstract class NetworkBoundResource<ResultType, RequestType>(private val mExecutors: AppExecutors) {

    private val result = MediatorLiveData<Resource<ResultType>>()

    init
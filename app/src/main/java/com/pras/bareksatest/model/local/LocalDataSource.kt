package com.pras.bareksatest.model.local

import androidx.lifecycle.LiveData
import com.pras.bareksatest.model.local.entity.DataEntity
import com.pras.bareksatest.model.local.room.AppDao

class LocalDataSource private constructor(private val mAppDao: AppDao) {

    companion object {
        private var INSTANCE: LocalDataSource? = null
        fun getInstance(appDao: AppDao): LocalDataSource = INSTANCE?: LocalD
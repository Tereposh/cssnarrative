package com.pras.bareksatest.utils

import android.os.Handler
import android.os.Looper
import androidx.annotation.VisibleForTesting
import java.util.concurrent.Executor
import java.util.concurrent.Executors

class AppExecutors@VisibleForTesting constructor(
    private val diskIO: Executor,
  
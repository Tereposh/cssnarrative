package com.pras.bareksatest.utils

import androidx.test.espresso.IdlingResource
import androidx.test.espresso.idling.CountingIdlingResource

object EspressoIdlingResource {
    private val RESOURCE: String? = "GLOBAL"
    private val espressoTestIdlingResource = Countin
package com.pras.bareksatest.vo

data class Resource<T>(val status: Status, val data: T?, val message: String?) {
    companion object {
        f
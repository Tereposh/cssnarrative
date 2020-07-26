package com.pras.bareksatest.model.remote

import android.content.Context
import android.util.Log
import com.pras.bareksatest.model.remote.response.DataResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import kotlin.math.min

class JsonHelper(private val context: Context) {
    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)

        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun loadData(): List<DataResponse> {
        val list = ArrayList<DataResponse>()
        tr
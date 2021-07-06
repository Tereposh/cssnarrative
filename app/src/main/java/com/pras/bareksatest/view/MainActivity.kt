package com.pras.bareksatest.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.google.android.material.tabs.TabLayoutMediator
import com.pras.bareksatest.R
import com.pras.bareksatest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //    lateinit var lineList: ArrayList<Entry>
//    lateinit var lineDataSet: LineDataSet
//    lateinit var lineData: LineData
    lateinit var binding: ActivityMainBinding
//    private var aaChartModel: AAChartModel()
//    private var aaChartView: AAChartView? = null

    companion object {
        @String
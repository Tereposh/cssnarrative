package com.pras.bareksatest.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement
import com.pras.bareksatest.R
import com.pras.bareksatest.databinding.FragmentImbalHasilBinding
import com.pras.bareksatest.viewModel.GetDataViewModel
import com.pras.bareksatest.viewModel.GetDataViewModelFactory

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ImbalHasilFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ImbalHasilFragment : Fragment() {

    private var _binding: FragmentImbalHasilBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: GetDataViewModel

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_imbal_hasil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentImbalHasilBinding.bind(view)
        val factory = GetDataViewModelFactory.getInstance(requireActivity())
        viewModel = ViewModelProvider(this, factory)[GetDataViewModel::class.java]

        viewModel.getData().observe(viewLifecycleOwner,{
            Log.d("graphArrayView", it.data.toString())
            binding.apply {

                val arr = it.data?.get(0)?.graph?.split(",")?.toTypedArray()
                Log.d("graphArrayViewArr", arr?.get(0).toString())
//                val name = it.data?.get(0)?.name
//                Log.d("arr", it.data!!.size.toString())

                val aaChartModel: AAChartModel = AAChartModel()
                    .chartType(AAChartType.Spline)
                    .dataLabelsEnabled(false)
                    .backgroundColor("#FFFFFF")
                    .categories(arrayOf("Jul 19", "Okt 19", "Jan 20", "Apr 20", "Jul 20"))
                    .legendEnabled(false)
                    .yAxisMax(40f)
                    .yAxisTitle("")
                    .series(
                        arrayOf(
                            AASeriesElement()
                                .name(it.data?.get(0)?.name)
                                .data(arrayOf(0.0,5.0,12.0,23.0,40.0))
                                .color("#788D68"),
                            AASeriesElement()
                                .name(it.data?.get(1)?.name)
                                .data(arrayOf(0.0, 5.0, 10.0, 15.0, 25.0))
                                .color("#67568B"),
                            AASeriesElement()
                                .name(it.data?.get(2)?.name)
                                .data(arrayOf(0.0, 1.0, 1.5, 2.0, 4.0))
                                .color("#789FBB")
                      
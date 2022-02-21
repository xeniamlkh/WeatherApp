package ru.gb.weatherapp.view

// UI Layer (View)

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import ru.gb.weatherapp.R
import ru.gb.weatherapp.databinding.MainFragmentBinding
import ru.gb.weatherapp.viewmodel.MainViewModel

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    //private lateinit var viewModel: MainViewModel
    private val viewModel: MainViewModel by activityViewModels()

    private var _binding: MainFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = MainFragmentBinding.inflate(inflater, container, false)
        val view = binding.root

        //viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        var adapter = CitiesRecycleAdapter()
        binding.recyclerViewMainFrg.layoutManager = LinearLayoutManager(activity)
        binding.recyclerViewMainFrg.adapter = adapter

        adapter.setOnItemClickListener(object : CitiesRecycleAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                viewModel.setCity(position)
                runItemFragment()
            }
        })

        return view
    }

    private fun runItemFragment() {
        activity?.supportFragmentManager
            ?.beginTransaction()
            ?.replace(R.id.fragment_frame, ItemFragment.newInstance())
            ?.addToBackStack(null)
            ?.commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
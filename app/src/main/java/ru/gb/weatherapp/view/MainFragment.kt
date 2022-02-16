package ru.gb.weatherapp.view

// UI Layer (View)

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.gb.weatherapp.databinding.MainFragmentBinding
import ru.gb.weatherapp.viewmodel.MainViewModel

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    private var _binding: MainFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = MainFragmentBinding.inflate(inflater, container, false)
        val view = binding.root

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.city.observe(viewLifecycleOwner, Observer { newCity ->
            binding.city.text = newCity.toString()
        })
        viewModel.temp.observe(viewLifecycleOwner, Observer { newTemp ->
            binding.temperature.text = newTemp.toString()
        })

        binding.moscowButton.setOnClickListener { passMoscowToCity() }
        binding.newYorkButton.setOnClickListener { passNewYorkToCity() }
        binding.helsinkiButton.setOnClickListener { passHelsinkiToCity() }

        return view
    }

    private fun passMoscowToCity() {
        viewModel.setMoscow()
    }

    private fun passNewYorkToCity() {
        viewModel.setNewYork()
    }

    private fun passHelsinkiToCity() {
        viewModel.setHelsinki()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
package ru.gb.weatherapp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import ru.gb.weatherapp.databinding.ItemFragmentBinding
import ru.gb.weatherapp.viewmodel.MainViewModel

class ItemFragment : Fragment() {

    companion object {
        fun newInstance() = ItemFragment()
    }

    private val viewModel: MainViewModel by activityViewModels()

    private var _binding: ItemFragmentBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ItemFragmentBinding.inflate(inflater, container, false)
        val view = binding?.root

        viewModel.city.observe(viewLifecycleOwner, Observer { newCity ->
            binding?.city?.text = newCity.toString()
        })

        viewModel.temp.observe(viewLifecycleOwner, Observer { newTemp ->
            binding?.temperature?.text = newTemp.toString()
        })

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
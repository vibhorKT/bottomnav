package com.example.bottomnavbar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.bootomnavbar.R
import com.example.bootomnavbar.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

    private  var _binding: HomeFragmentBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = HomeFragmentBinding.inflate(inflater, container, false)
        val view = binding?.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.forHomeFragment1.setOnClickListener{
            Navigation.findNavController(requireActivity(), R.id.nav_host_fragment).navigate(R.id.to_homeFragment1)
        }

        binding.forHomeFragment2.setOnClickListener{
            Navigation.findNavController(requireActivity(), R.id.nav_host_fragment).navigate(R.id.to_homeFragment2)
        }

        binding.forCommonFragment.setOnClickListener{
            Navigation.findNavController(requireActivity(), R.id.nav_host_fragment).navigate(R.id.to_commonFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
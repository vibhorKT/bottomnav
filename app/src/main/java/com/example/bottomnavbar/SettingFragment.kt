package com.example.bottomnavbar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bootomnavbar.databinding.SettingFragmentBinding

class SettingFragment : Fragment() {

    private lateinit var _binding: SettingFragmentBinding

    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = SettingFragmentBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
}
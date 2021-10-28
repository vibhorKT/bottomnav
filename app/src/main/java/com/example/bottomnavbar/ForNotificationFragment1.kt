package com.example.bottomnavbar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bootomnavbar.databinding.ForNotification1Binding

class ForNotificationFragment1 : Fragment() {

    private lateinit var _binding: ForNotification1Binding

    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = ForNotification1Binding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
}
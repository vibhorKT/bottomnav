package com.example.bottomnavbar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.bootomnavbar.R
import com.example.bootomnavbar.databinding.NotificationFragmentBinding

class NotificationFragment : Fragment() {

    private lateinit var _binding: NotificationFragmentBinding

    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = NotificationFragmentBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.forNotificationFragment1.setOnClickListener{
            Navigation.findNavController(requireActivity(), R.id.nav_host_fragment).navigate(R.id.to_notificationFragment1)
        }

        binding.forNotificationFragment2.setOnClickListener{
            Navigation.findNavController(requireActivity(), R.id.nav_host_fragment).navigate(R.id.to_notificationFragment2)
        }

        binding.forCommonFragmentFromNotification.setOnClickListener{
            Navigation.findNavController(requireActivity(), R.id.nav_host_fragment).navigate(R.id.to_commonFragment)
        }
    }
}
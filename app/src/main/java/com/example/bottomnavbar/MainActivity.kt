package com.example.bottomnavbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.bootomnavbar.R
import com.example.bootomnavbar.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupNav()
    }

    private fun setFragment(fr: Fragment) {
        val frag = supportFragmentManager.beginTransaction()
        frag.add(R.id.nav_host_fragment, fr)
        frag.commit()
    }


    private fun setupNav() {

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNav)
        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        NavigationUI.setupWithNavController(bottomNavigationView, navController)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.homeFragment -> {
                    showBottomNav()
                }
                R.id.notificationFragment -> {
                    showBottomNav()
                }
                R.id.settingFragment -> {
                    showBottomNav()
                }
                else -> hideBottomNav()
            }
        }
    }

    fun showBottomNav() {
        binding.bottomNav.isVisible = true

    }

    fun hideBottomNav() {
        binding.bottomNav.isVisible = false
    }
}
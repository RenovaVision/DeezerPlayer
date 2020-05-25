package com.renovavision.deezerplayer.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.renovavision.deezerplayer.R
import com.renovavision.deezerplayer.inject.DaggerFragmentFactory
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    @Inject
    internal lateinit var daggerFragmentFactory: DaggerFragmentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        supportFragmentManager.fragmentFactory = daggerFragmentFactory
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)

        val hostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        val navController = hostFragment.navController

        setupBottomNavView(navController)
    }

    private fun setupBottomNavView(navController: NavController) {
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavView)
        bottomNav?.setupWithNavController(navController)
    }
}
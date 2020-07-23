package com.renovavision.deezerplayer.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.renovavision.deezerplayer.R
import com.renovavision.deezerplayer.inject.DaggerFragmentFactory
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    @Inject
    internal lateinit var navigator: NavigatorImpl

    @Inject
    internal lateinit var daggerFragmentFactory: DaggerFragmentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        navigator.bind(this)
        supportFragmentManager.fragmentFactory = daggerFragmentFactory
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        navigator.unbind()
        super.onDestroy()
    }
}
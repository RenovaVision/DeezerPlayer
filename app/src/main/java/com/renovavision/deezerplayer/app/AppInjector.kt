package com.renovavision.deezerplayer.app

import android.app.Application
import com.renovavision.deezerplayer.activity.MainActivityModule
import com.renovavision.deezerplayer.activity.NavigationModule
import com.renovavision.deezerplayer.data.NetworkModule
import com.renovavision.deezerplayer.data.RepositoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import java.io.File
import javax.inject.Named
import javax.inject.Singleton

@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        MainActivityModule::class,
        RepositoryModule::class,
        NetworkModule::class,
        NavigationModule::class
    ]
)
@Singleton
interface AppInjector {

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance application: Application,
            @BindsInstance @Named("apiUrl")
            apiUrl: String,
            @BindsInstance @Named("cacheDir")
            cacheDir: File?
        ): AppInjector
    }

    fun inject(app: App)
}
package com.renovavision.deezerplayer.activity;

import com.renovavision.deezerplayer.album.AlbumModule;
import com.renovavision.deezerplayer.artist.ArtistModule;
import com.renovavision.deezerplayer.tracks.TracksModule;
import com.renovavision.player.PlayerModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainActivityModule_MainActivity.MainActivitySubcomponent.class)
public abstract class MainActivityModule_MainActivity {
  private MainActivityModule_MainActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent(
    modules = {
      TracksModule.class,
      ArtistModule.class,
      AlbumModule.class,
      PlayerModule.class,
      NavigationModule.class
    }
  )
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}

// Generated by Dagger (https://dagger.dev).
package com.renovavision.deezerplayer.activity;

import com.renovavision.deezerplayer.inject.DaggerFragmentFactory;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<DaggerFragmentFactory> daggerFragmentFactoryProvider;

  public MainActivity_MembersInjector(
      Provider<DaggerFragmentFactory> daggerFragmentFactoryProvider) {
    this.daggerFragmentFactoryProvider = daggerFragmentFactoryProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<DaggerFragmentFactory> daggerFragmentFactoryProvider) {
    return new MainActivity_MembersInjector(daggerFragmentFactoryProvider);}

  @Override
  public void injectMembers(MainActivity instance) {
    injectDaggerFragmentFactory(instance, daggerFragmentFactoryProvider.get());
  }

  @InjectedFieldSignature("com.renovavision.deezerplayer.activity.MainActivity.daggerFragmentFactory")
  public static void injectDaggerFragmentFactory(MainActivity instance,
      DaggerFragmentFactory daggerFragmentFactory) {
    instance.daggerFragmentFactory = daggerFragmentFactory;
  }
}
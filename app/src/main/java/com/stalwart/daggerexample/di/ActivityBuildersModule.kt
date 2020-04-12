package com.stalwart.daggerexample.di

import com.stalwart.daggerexample.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeAuthActivityInjector(): AuthActivity
}
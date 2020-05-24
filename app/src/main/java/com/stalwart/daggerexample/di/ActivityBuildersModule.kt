package com.stalwart.daggerexample.di

import com.stalwart.daggerexample.di.auth.AuthViewModelModule
import com.stalwart.daggerexample.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = [AuthViewModelModule::class])
    abstract fun contributeAuthActivityInjector(): AuthActivity
}
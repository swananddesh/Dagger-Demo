package com.stalwart.daggerexample.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.stalwart.daggerexample.ui.auth.AuthViewModel
import com.stalwart.daggerexample.viewmodels.ViewModelProviderFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
Created by Swanand Deshpande
 */
@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelProviderFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(authViewModel: AuthViewModel): ViewModel
}
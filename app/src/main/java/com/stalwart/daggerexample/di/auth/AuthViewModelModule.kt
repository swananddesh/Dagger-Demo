package com.stalwart.daggerexample.di.auth

import androidx.lifecycle.ViewModel
import com.stalwart.daggerexample.di.ViewModelKey
import com.stalwart.daggerexample.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
Created by Swanand Deshpande
 */
@Module
abstract class AuthViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(authViewModel: AuthViewModel): ViewModel
}
package com.stalwart.daggerexample.di

import android.app.Application
import com.stalwart.daggerexample.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class, ActivityBuildersModule::class,
               AppModule::class, ViewModelFactoryModule::class]
)
interface AppComponent : AndroidInjector<BaseApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance // This can bind the application object when it is built.
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}
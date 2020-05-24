package com.stalwart.daggerexample.di

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.stalwart.daggerexample.R
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
Created by Swanand on 2020-04-18
 */

/**
 * This class is used to mention application level dependencies that will be used
 * throughout the application.
 * e.g. Retrofit instance, Glide instance etc.
 **/
@Module(includes = [ViewModelFactoryModule::class])
class AppModule {
    companion object{

        @Singleton
        @Provides
        fun provideRequestOptions(): RequestOptions {
            return RequestOptions.placeholderOf(R.drawable.white_background)
                .error(R.drawable.white_background)
        }

        @Singleton
        @Provides
        fun provideGlideInstance(application: Application, requestOptions: RequestOptions): RequestManager{
            return Glide.with(application)
                .setDefaultRequestOptions(requestOptions)
        }

        @Singleton
        @Provides
        fun provideAppDrawable(application: Application): Drawable {
            return ContextCompat.getDrawable(application, R.drawable.logo)!!
        }
    }
}
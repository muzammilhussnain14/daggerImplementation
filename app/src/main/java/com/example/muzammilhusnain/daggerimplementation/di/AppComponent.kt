package com.example.muzammilhusnain.daggerimplementation.di

import android.app.Application
import com.example.muzammilhusnain.daggerimplementation.DaggerImplementationApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ ApplicationModule::class, ActivityBindingModule::class ,AndroidSupportInjectionModule::class])
interface AppComponent : AndroidInjector<DaggerImplementationApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application) : AppComponent.Builder

        fun build() : AppComponent
    }
}
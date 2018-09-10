package com.example.muzammilhusnain.daggerimplementation

import com.example.muzammilhusnain.daggerimplementation.di.DaggerAppComponent
import javax.inject.Inject

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class DaggerImplementationApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>? {
        return DaggerAppComponent.builder().application(this).build()
    }
}

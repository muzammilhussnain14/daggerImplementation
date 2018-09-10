package com.example.muzammilhusnain.daggerimplementation.di

import com.example.muzammilhusnain.daggerimplementation.tasks.TasksActivity
import com.example.muzammilhusnain.daggerimplementation.tasks.TasksModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract  class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [TasksModule::class])
    abstract fun taskActivity(): TasksActivity
}
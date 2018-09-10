package com.example.muzammilhusnain.daggerimplementation.tasks

import android.arch.lifecycle.LifecycleOwner
import com.example.muzammilhusnain.daggerimplementation.di.ActivityScoped
import com.example.muzammilhusnain.daggerimplementation.di.FragmentScoped
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * This is a Dagger module. We use this to pass in the View dependency to the
 * {@link TasksPresenter}.
 */
@Module
abstract class TasksModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun taskFragment(): TasksFragment

    @ActivityScoped
    @Binds
    abstract fun taskPresenter(tasksPresenter: TasksPresenter): TasksContract.Presenter

    @ActivityScoped
    @Binds
    abstract fun lifecycleOwner(activity: TasksActivity) : LifecycleOwner
}

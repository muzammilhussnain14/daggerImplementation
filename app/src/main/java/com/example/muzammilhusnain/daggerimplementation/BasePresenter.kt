package com.example.muzammilhusnain.daggerimplementation

import android.arch.lifecycle.LifecycleObserver

interface BasePresenter<T>  : LifecycleObserver{

    /**
     * Binds presenter with a view when resumed. The Presenter will perform initialization here.
     *
     * @param view the view associated with this presenter
     */
    fun takeView(view: T)

    /**
     * Drops the reference to the view when destroyed
     */
    fun dropView()

}
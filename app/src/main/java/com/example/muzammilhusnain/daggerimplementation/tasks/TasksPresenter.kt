package com.example.muzammilhusnain.daggerimplementation.tasks

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.OnLifecycleEvent
import android.content.Context
import com.example.muzammilhusnain.daggerimplementation.di.ActivityScoped
import javax.inject.Inject


@ActivityScoped
class TasksPresenter @Inject constructor(private val lifecycleOwner: LifecycleOwner, private val context: Context) : TasksContract.Presenter {

    init {
        lifecycleOwner.lifecycle.addObserver(this)
    }

    private var mTasksView : TasksContract.View? = null

    override fun takeView(view: TasksContract.View) {
        this.mTasksView = view
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    override fun dropView() {
        this.mTasksView = null
    }
}
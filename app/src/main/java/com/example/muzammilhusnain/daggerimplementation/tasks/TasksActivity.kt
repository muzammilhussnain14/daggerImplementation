package com.example.muzammilhusnain.daggerimplementation.tasks

import android.os.Bundle
import com.example.muzammilhusnain.daggerimplementation.R
import dagger.Lazy
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class TasksActivity : DaggerAppCompatActivity() {

    var mTasksPresenter: TasksPresenter? = null
    @Inject set

    var taskFragmentProvider: Lazy<TasksFragment>? = null
    @Inject set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        drawer_layout.setStatusBarBackground(R.color.colorPrimaryDark)

        var taskFragment = supportFragmentManager.findFragmentById(R.id.contentFrame)

        if (taskFragment == null){
            taskFragment = taskFragmentProvider?.get()
            taskFragment?.let {
                supportFragmentManager.beginTransaction().replace(R.id.contentFrame,it).commit()
            }
        }
    }
}

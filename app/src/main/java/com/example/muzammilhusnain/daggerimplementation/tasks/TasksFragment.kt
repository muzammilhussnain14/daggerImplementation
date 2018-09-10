package com.example.muzammilhusnain.daggerimplementation.tasks


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.muzammilhusnain.daggerimplementation.R
import com.example.muzammilhusnain.daggerimplementation.di.ActivityScoped
import dagger.android.support.DaggerFragment
import javax.inject.Inject


@ActivityScoped
class TasksFragment @Inject constructor() : DaggerFragment() , TasksContract.View{

    var mPresenter: TasksContract.Presenter? = null
    @Inject set

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tasks, container, false)
    }

    override fun onResume() {
        super.onResume()
        mPresenter?.takeView(this)
    }

}

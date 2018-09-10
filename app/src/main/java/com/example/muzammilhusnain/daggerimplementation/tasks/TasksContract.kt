package com.example.muzammilhusnain.daggerimplementation.tasks

import com.example.muzammilhusnain.daggerimplementation.BasePresenter
import com.example.muzammilhusnain.daggerimplementation.BaseView

interface TasksContract {

    interface View : BaseView<Presenter>

    interface Presenter : BasePresenter<View>
}
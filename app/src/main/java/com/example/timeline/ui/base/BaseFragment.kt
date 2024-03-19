package com.example.timeline.ui.base

import androidx.fragment.app.Fragment
import com.example.timeline.ui.base.delegate.BaseDelegateFactory

abstract class BaseFragment : Fragment() {
    //create view model
    abstract val mViewModel: BaseViewModel

    //create delegate factory
    open val mDelegateFactory: BaseDelegateFactory<*, *> by lazy {
        BaseDelegateFactory(this, mViewModel)
    }


}
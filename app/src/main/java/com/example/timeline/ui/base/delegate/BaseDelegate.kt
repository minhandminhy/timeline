package com.example.timeline.ui.base.delegate

import com.example.timeline.ui.base.BaseFragment
import com.example.timeline.ui.base.BaseViewModel

open class BaseDelegate<V : BaseFragment, VM : BaseViewModel>(
    val mFragment: V,
    val mViewModel: VM
) {
    public fun onCreate() {
    }

    public fun onCreateView() {
    }

    public fun onViewCreated() {
    }

    public fun onStart() {
    }

    public fun onResume() {
    }

    public fun onPause() {
    }

    public fun onStop() {
    }

    public fun onDestroy() {
    }
}
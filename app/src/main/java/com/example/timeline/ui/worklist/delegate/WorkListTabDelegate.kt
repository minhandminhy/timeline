package com.example.timeline.ui.worklist.delegate

import com.example.timeline.ui.base.BaseFragment
import com.example.timeline.ui.base.BaseViewModel
import com.example.timeline.ui.base.delegate.BaseDelegate
import com.example.timeline.ui.worklist.WorkListFragment
import com.example.timeline.ui.worklist.WorkListViewModel

class WorkListTabDelegate<V : WorkListFragment, VM : WorkListViewModel>(f: V, vm: VM) :
    BaseDelegate<V, VM>(f, vm) {

}
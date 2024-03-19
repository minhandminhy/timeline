package com.example.timeline.ui.worklist.delegate

import com.example.timeline.ui.base.delegate.BaseDelegate
import com.example.timeline.ui.base.delegate.BaseDelegateFactory
import com.example.timeline.ui.common.KeyDelegate
import com.example.timeline.ui.worklist.WorkListFragment
import com.example.timeline.ui.worklist.WorkListViewModel

class WorkListDelegateFactory<V : WorkListFragment, VM : WorkListViewModel>(f: V, vm: VM) :
    BaseDelegateFactory<V, VM>(f, vm) {
    override fun createListDelegate(): List<Pair<KeyDelegate, BaseDelegate<V, VM>>> {
        return mutableListOf(
            Pair(KeyDelegate.WorkListTabDelegate, WorkListTabDelegate(mFragment, mViewModel))
        )
    }
}
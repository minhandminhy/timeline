package com.example.timeline.ui.base.delegate

import com.example.timeline.ui.base.BaseFragment
import com.example.timeline.ui.base.BaseViewModel
import com.example.timeline.ui.common.KeyDelegate
import java.util.EnumMap

open class BaseDelegateFactory<V : BaseFragment, VM : BaseViewModel>(
    val mFragment: V,
    val mViewModel: VM
) {
    private val mHashMap: EnumMap<KeyDelegate, BaseDelegate<V, VM>> =
        EnumMap(KeyDelegate::class.java)
    open fun createListDelegate(): List<Pair<KeyDelegate, BaseDelegate<V, VM>>> {
        return emptyList()
    }

    init {
        createListDelegate().forEach {
            mHashMap[it.first] = it.second
        }
    }

    private fun getListDelegate(): List<BaseDelegate<V, VM>> {
        return mHashMap.values.toMutableList()
    }

    public fun onCreate() {
        getListDelegate().forEach {
            it.onCreate()
        }
    }

    public fun onCreateView() {
        getListDelegate().forEach {
            it.onCreateView()
        }
    }

    public fun onViewCreated() {
        getListDelegate().forEach {
            it.onViewCreated()
        }
    }

    public fun onStart() {
        getListDelegate().forEach {
            it.onStart()
        }
    }

    public fun onResume() {
        getListDelegate().forEach {
            it.onResume()
        }
    }

    public fun onPause() {
        getListDelegate().forEach {
            it.onPause()
        }
    }

    public fun onStop() {
        getListDelegate().forEach {
            it.onStop()
        }
    }

    public fun onDestroy() {
        getListDelegate().forEach {
            it.onDestroy()
        }
    }
}

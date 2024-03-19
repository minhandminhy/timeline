package com.example.timeline.ui.base.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.ListAdapter
import com.example.timeline.ui.base.data.BaseData
import com.example.timeline.ui.base.diff.BaseDiffUntil
import com.example.timeline.ui.base.diff.IDiff

abstract class BaseAdapter<ITEM : IDiff<ITEM>, LIS : BaseHandleListener, DATA : BaseData<ITEM>> :
    ListAdapter<ITEM, BaseViewHolder>(BaseDiffUntil<ITEM>()) {

    var data: DATA? = null
        private set
    var mListener: BaseHandleListener? = null
        private set

    fun setData(data: DATA) {
        this.data = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(getLayout(), parent, false)
        return BaseViewHolder(view)
    }

    @LayoutRes
    abstract fun getLayout(): Int

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        getItemPosition(position)?.let {
            bindView(it, holder, position, mListener)
        }
    }

    abstract fun bindView(
        item: ITEM,
        holder: BaseViewHolder,
        pos: Int,
        mListener: BaseHandleListener?
    )

    private fun getItemPosition(pos: Int): ITEM? {
        return data?.getItemAtPosition(pos)
    }
}

interface BaseHandleListener {
    fun itemClick()
    fun itemLongClick()
}

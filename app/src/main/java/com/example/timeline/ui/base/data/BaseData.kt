package com.example.timeline.ui.base.data

import android.icu.text.Transliterator.Position

class BaseData<ITEM> {
    var data: List<ITEM> = emptyList()
        private set
    var mListener: MutableList<BaseDataChange> = mutableListOf()
        private set
    private val LOCK: String = "LOCK"

    fun setData(data: List<ITEM>) {
        synchronized(LOCK) {
            this.data = data
            notifyData()
        }
    }

    fun registerDataChangeListener(listener: BaseDataChange) {
        mListener.add(listener)
    }

    fun unRegisterDataChangeListener(listener: BaseDataChange) {
        mListener.remove(listener)
    }

    fun getItemAtPosition(position: Int): ITEM {
        return data[position]
    }

    fun getSizeOfData(): Int {
        return data.size
    }

    fun getAllData(): Int {
        return data.size
    }

    private fun notifyData() {
        var copied: ArrayList<BaseDataChange>? = null
        synchronized(LOCK) {
            copied = ArrayList(mListener)
        }
        copied?.forEach {
            it.updateData()
        }
    }
}

interface BaseDataChange {
    fun updateData()
}
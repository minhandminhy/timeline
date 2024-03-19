package com.example.timeline.ui.base.diff

import androidx.recyclerview.widget.DiffUtil

//chi can truyen newItem boi vi sau nay o trong mediaItem thi this.type == newItem.type
//oldItem.are... -> phuong thuc are... la nam trong doi tuong oldItem -> co the lay this duoc roi
class BaseDiffUntil<I : IDiff<I>> : DiffUtil.ItemCallback<I>() {
    override fun areItemsTheSame(oldItem: I, newItem: I): Boolean {
        return oldItem.areItemsTheSameItem(newItem)
    }

    override fun areContentsTheSame(oldItem: I, newItem: I): Boolean {
        return oldItem.areContentsTheSameItem(newItem)
    }


}
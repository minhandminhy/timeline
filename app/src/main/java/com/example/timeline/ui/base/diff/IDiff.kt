package com.example.timeline.ui.base.diff

interface IDiff<ITEM> {
    fun areItemsTheSameItem(newItem: ITEM): Boolean
    fun areContentsTheSameItem(newItem: ITEM): Boolean
}
package com.example.timeline.ui.worklist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.timeline.R
import com.example.timeline.ui.base.BaseFragment
import com.example.timeline.ui.base.BaseViewModel
import com.example.timeline.ui.base.delegate.BaseDelegateFactory
import com.example.timeline.ui.worklist.delegate.WorkListDelegateFactory

class WorkListFragment : BaseFragment() {
    override val mViewModel: WorkListViewModel by viewModels()
    override val mDelegateFactory: WorkListDelegateFactory<*, *> by lazy {
        WorkListDelegateFactory<WorkListFragment, WorkListViewModel>(this, mViewModel)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDelegateFactory.onCreate()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mDelegateFactory.onCreateView()
        return inflater.inflate(R.layout.fragment_work_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mDelegateFactory.onViewCreated()
    }

    override fun onDestroy() {
        super.onDestroy()
        mDelegateFactory.onDestroy()
    }

    override fun onResume() {
        super.onResume()
        mDelegateFactory.onResume()
    }

    override fun onStart() {
        super.onStart()
        mDelegateFactory.onStart()
    }

    override fun onStop() {
        super.onStop()
        mDelegateFactory.onStop()
    }

    override fun onPause() {
        super.onPause()
        mDelegateFactory.onPause()
    }
//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment WorkListFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            WorkListFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
}
package com.pandax.cpushedule.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pandax.cpushedule.R


class FragmentMain : Fragment(){

    val TAG :String = FragmentMain::class.simpleName!!

    var v: View = null!!

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        v = LayoutInflater.from(activity).inflate(R.layout.fragment_main, container, false)
        return v
    }
}
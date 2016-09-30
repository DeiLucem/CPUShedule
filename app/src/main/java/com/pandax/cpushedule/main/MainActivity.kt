package com.pandax.cpushedule.main

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.widget.Toolbar
import com.pandax.cpushedule.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)

        defineToolbar()
        showScreen(FragmentMain(), false)

    }

    fun showScreen(fragment: Fragment, addToBackStack: Boolean) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        if (addToBackStack) {
            transaction.addToBackStack(fragment.tag)
        }
        transaction.replace(R.id.main_frame, fragment, fragment.tag)
        transaction.commit()
    }

    fun defineToolbar() {
        val toolbar : Toolbar = findViewById(R.id.toolbar) as Toolbar
        setActionBar(toolbar)
    }
}

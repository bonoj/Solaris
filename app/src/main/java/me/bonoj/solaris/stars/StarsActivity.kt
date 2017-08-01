package me.bonoj.solaris.stars

import android.arch.lifecycle.LifecycleActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_stars.*
import me.bonoj.solaris.R

class StarsActivity : LifecycleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stars)

        debug_tv.setText("stars")
    }
}

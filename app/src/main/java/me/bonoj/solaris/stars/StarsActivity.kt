package me.bonoj.solaris.stars

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_stars.*
import me.bonoj.solaris.R

class StarsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stars)

        debug_tv.setText("stars")
    }
}

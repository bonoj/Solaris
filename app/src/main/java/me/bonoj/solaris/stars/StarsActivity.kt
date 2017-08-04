package me.bonoj.solaris.stars

import android.arch.lifecycle.LifecycleActivity
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_stars.*
import me.bonoj.solaris.R
import me.bonoj.solaris.data.Star

class StarsActivity : LifecycleActivity() {

    lateinit var viewModel: StarsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stars)

        viewModel = ViewModelProviders.of(this).get(StarsViewModel::class.java)
        viewModel.getStars().observe(this, Observer {
            if (it != null){
                displayStars(it)
            }
        })
    }

    private fun displayStars(stars: List<Star>) {

        var starString: String = ""
        for (star in stars) {
            Log.i("STARZ", star.toString())
            starString += star.toString() + "\n"
        }

        debug_tv.setText(starString)
    }
}

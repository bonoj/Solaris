package me.bonoj.solaris.stars

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import me.bonoj.solaris.data.Star

class StarsViewModel : ViewModel() {

    private var stars: MutableLiveData<List<Star>>? = null

    fun getStars(): LiveData<List<Star>> {
        if (stars == null) {
            stars = MutableLiveData<List<Star>>()
            loadStars()
        }
        return stars!!
    }

    private fun loadStars() {
        // Fetch stars asynchronously from repository.

        // TODO Remove dummy data
        val starsFromRepo: ArrayList<Star> = ArrayList()
        starsFromRepo.add(Star(1,1,1,1))
        starsFromRepo.add(Star(1,1,1,1))
        starsFromRepo.add(Star(1,1,1,1))

        stars!!.postValue(starsFromRepo)

    }
}

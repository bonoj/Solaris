package me.bonoj.solaris.stars;

import android.arch.lifecycle.ViewModel;

import me.bonoj.solaris.data.Star;

public class StarsViewModel extends ViewModel {
    private String starId;
    private Star star;

    public void init(String starId) {
        this.starId = starId;
    }

    public Star getStar() {
        return star;
    }

}

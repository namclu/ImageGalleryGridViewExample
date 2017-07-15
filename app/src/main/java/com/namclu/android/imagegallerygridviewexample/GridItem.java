package com.namclu.android.imagegallerygridviewexample;

/**
 * Created by namlu on 7/14/2017.
 *
 * GridItem represents a single Grid object
 */

public class GridItem {

    private String mImage;
    private String mTitle;

    public GridItem() {
        super();
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}

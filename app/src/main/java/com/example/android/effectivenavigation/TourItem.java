package com.example.android.effectivenavigation;

/**
 * Created by salva on 22/08/2016.
 */
public class TourItem  {
    private int mImage;
    private String mTitle;
    private String mDescription;

/*    public void TourItem( String title,  int image, String description) {

        mImage = image;
        mTitle = title;
        mDescription = description;
    }*/

    public TourItem(String title, int image){

        mTitle = title;
        mImage = image;
    }

    public int getmImage() {
        return mImage;
    }

    public String getmTile() {
        return mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }
}

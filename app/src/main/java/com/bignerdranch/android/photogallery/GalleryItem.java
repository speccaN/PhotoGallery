package com.bignerdranch.android.photogallery;

public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUrl;

    @Override
    public String toString() {
        return mCaption;
    }

    public void setId(String id) {
        mId = id;
    }

    public void setCaption(String title) {
        mCaption = title;
    }

    public void setUrl(String url_s) {
        mUrl = url_s;
    }
}

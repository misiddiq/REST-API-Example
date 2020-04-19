package com.example.restapiexample;

import com.google.gson.annotations.SerializedName;

public class PhotoModel {
    @SerializedName("title")
    String tvtitle;

    @SerializedName("url")
    String fullUrl;

    @SerializedName("id")
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTvtitle(String tvtitle) {
        this.tvtitle = tvtitle;
    }

    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

    public String getTvtitle() {
        return tvtitle;
    }

    public String getFullUrl() {
        return fullUrl;
    }
}

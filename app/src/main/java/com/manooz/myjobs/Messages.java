package com.manooz.myjobs;

/**
 * Created by MaNoOoz on 1/9/2018.
 */

public class Messages {
    private String text;
    private String name;
    private String photoUrl;

    public Messages() {
    }

    public Messages(String text, String name, String photoUrl) {
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}


package com.example.app3.Domain;

import java.io.Serializable;

public class Lessions implements Serializable {
    private String title;
    private String duration;
    private String link;
    private String picPath;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public Lessions(String picPath, String link, String duration, String title) {
        this.picPath = picPath;
        this.link = link;
        this.duration = duration;
        this.title = title;
    }
}



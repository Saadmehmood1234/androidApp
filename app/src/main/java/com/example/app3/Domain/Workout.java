package com.example.app3.Domain;

import java.io.Serializable;
import java.util.ArrayList;

public class Workout implements Serializable {
    private String title;
    private String description;
    private String picPath;
    private double kcal;
    private String durationAll;
    private String latest;
    private ArrayList<Lessions> lessions;

    public Workout(String title, String description, String picPath, double kcal, String durationAll,String latest, ArrayList<Lessions> lessions) {
        this.title = title;
        this.description = description;
        this.picPath = picPath;
        this.kcal = kcal;
        this.durationAll = durationAll;
        this.latest=latest;
        this.lessions = lessions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public double getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public String getDurationAll() {
        return durationAll;
    }

    public void setDurationAll(String durationAll) {
        this.durationAll = durationAll;
    }

    public String getLatest() {
        return latest;
    }

    public void setLatest(String latest) {
        this.latest= latest;
    }

    public ArrayList<Lessions> getLessions() {
        return lessions;
    }

    public void setLessions(ArrayList<Lessions> lessions) {
        this.lessions = lessions;
    }
}




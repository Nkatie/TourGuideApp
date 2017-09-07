package com.example.mikatekonkatie.tourguideapp;

import java.io.Serializable;

/**
 * Created by Mikateko (Nkatie) on 2017/08/16.
 */

public class MalaTouring implements Serializable {
    private String name;
    private String Describe;
    private int image;

    public MalaTouring() {
    }

    public MalaTouring(String name, String describe, int image) {
        this.name = name;
        Describe = describe;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        Describe = describe;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
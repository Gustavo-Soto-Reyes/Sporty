package com.example.sporty;

public class Sport {
    int imageId;
    String sportName;

    public Sport(int imageId, String sportName) {
        this.imageId = imageId;
        this.sportName = sportName;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }
}

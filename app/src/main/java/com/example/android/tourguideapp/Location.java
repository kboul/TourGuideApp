package com.example.android.tourguideapp;

/**
 * Created by KostasBoul on 25.05.17.
 */

public class Location {
    private int imageResourceId;
    private int name;
    private int description;
    private int location;

    /**
     * Create a new Location object.
     *
     * @param imageResourceId is the image resource Id for the attraction
     * @param name            is the name of the attraction
     * @param location        is the location of the attraction
     */
    public Location(int imageResourceId, int name, int location) {
        this.imageResourceId = imageResourceId;
        this.name = name;
        this.location = location;
    }

    public Location(int imageResourceId, int name, int description, int location) {
        this.imageResourceId = imageResourceId;
        this.name = name;
        this.description = description;
        this.location = location;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public int getName() {
        return name;
    }

    public int getDescription() {
        return description;
    }

    public int getLocation() {
        return location;
    }
}

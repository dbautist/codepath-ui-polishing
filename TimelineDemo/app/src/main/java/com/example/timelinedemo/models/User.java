package com.example.timelinedemo.models;

public class User {
    private String name;
    private String profileUrl;

    public User(String name, String profileUrl) {
        this.name = name;
        this.profileUrl = profileUrl;
    }

    public String getName() {
        return name;
    }

    public String getProfileUrl() {
        return profileUrl;
    }
}


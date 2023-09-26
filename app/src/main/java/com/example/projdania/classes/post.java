package com.example.projdania.classes;

import java.util.List;

public class post implements alclass{
    private int likes;
    private String pid;
    private String text;
    private List<String> comments;

    // private image img;

    public post(String pid,int likes,String text) {
        this.pid = pid;
        this.likes = likes;
        this.text=text;
    }


    @Override
    public boolean Add() {
        return false;
    }

    @Override
    public boolean Delete() {
        return false;
    }

    @Override
    public boolean Update() {
        return false;
    }
}


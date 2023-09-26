package com.example.projdania.classes;

import java.util.List;

public class messages implements alclass {
    private String uid1;
    private String uid2;
    private String mid;
    private List<String>chat;

    public messages(String uid1, String uid2,String mid) {
        this.uid1 = uid1;
        this.uid2 = uid2;
        this.mid = mid;
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

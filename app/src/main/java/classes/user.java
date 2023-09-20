package classes;

import java.util.List;

public class user implements alclass {
    private List<post> saved;
    private String uid;
    private String username;
    private String email;
    private String password;

    public user(String uid,String username,String email,String password){
        this.uid=uid;
        this.username=username;
        this.email=email;
        this.password=password;
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

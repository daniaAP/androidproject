package ClASS;

import android.database.Cursor;

public class User implements SqlInterface{

    // region Attribute
    private String uid;
    private String username ;
    private String email;
    private String password;
    //endregion

    //region Cunstructors
    public User(String uid,String username,String email,String password){
        this.uid = uid;
        this.username= username;
        this.email=email;
        this.password=password;
    }
    //endregion

    //region Add,Delete,Update,Select sql
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

    @Override
    public Cursor Select() {
        return null;
    }
   //endregion

    //region Setter and Getter
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //endregion
}

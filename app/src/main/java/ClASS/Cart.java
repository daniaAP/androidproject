package ClASS;

import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

public class Cart implements SqlInterface{

    //region Attribute
    private int cartid;
    private String uid;
    private List<Integer>prodid;
    //endregion

    //region Constructors
    public Cart(int cartid,String uid){
        this.cartid=cartid;
        this.uid = uid;
        prodid = new ArrayList<Integer>();
    }

    public Cart(int cartid, String uid, List<Integer> products) {
        this.cartid = cartid;
        this.uid = uid;
        this.prodid = products;
    }
    //endregion

    //region Add,Delete,Update,Select Sql
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

    //region Getter and Setter
    public int getCartid() {
        return cartid;
    }

    public void setCartid(int cartid) {
        this.cartid = cartid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public List<Integer> getProducts() {
        return prodid;
    }

    public void setProducts(List<Integer> products) {
        this.prodid = products;
    }
    //endregion
}

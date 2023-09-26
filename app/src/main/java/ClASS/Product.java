package ClASS;

import android.database.Cursor;

public class Product implements SqlInterface{

    //region Attribute
    protected String pid;
    protected String prodname;
    protected String proddisc;
    protected String prodimg;
    protected int stock;
    protected double saleprice;
    protected double buyprice;
    //endregion

    //region Constructors
    public Product(String pid,String prodname,String proddisc,String prodimg,int stock,double saleprice,double buyprice){
        this.pid=pid;
        this.saleprice=saleprice;
        this.buyprice=buyprice;
        this.prodname=prodname;
        this.proddisc=proddisc;
        this.prodimg=prodimg;
        this.stock=stock;
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

    //region Setter and Getter
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public String getProddisc() {
        return proddisc;
    }

    public void setProddisc(String proddisc) {
        this.proddisc = proddisc;
    }

    public String getProdimg() {
        return prodimg;
    }

    public void setProdimg(String prodimg) {
        this.prodimg = prodimg;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(double saleprice) {
        this.saleprice = saleprice;
    }

    public double getBuyprice() {
        return buyprice;
    }

    public void setBuyprice(double buyprice) {
        this.buyprice = buyprice;
    }
    //endregion

}

package ClASS;

import android.database.Cursor;

import java.util.List;

public class Sales implements SqlInterface{
    //region Attributes
    private int salesid;
    private int salesprodid;
    private String salesuserid;
    private double salesprices;
    private double buyprices;
   //endregion

    //region Constructors
    public Sales(int salesid, int salesprod, String salesuser, double salesprices, double buyprices) {
        this.salesid = salesid;
        this.salesprodid = salesprod;
        this.salesuserid = salesuser;
        this.salesprices = salesprices;
        this.buyprices = buyprices;
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
    public int getSalesid() {
        return salesid;
    }

    public void setSalesid(int salesid) {
        this.salesid = salesid;
    }

    public int getSalesprod() {
        return salesprodid;
    }

    public void setSalesprod(int salesprod) {
        this.salesprodid = salesprod;
    }

    public String getSalesuser() {
        return salesuserid;
    }

    public void setSalesuser(String salesuser) {
        this.salesuserid = salesuser;
    }

    public double getSalesprices() {
        return salesprices;
    }

    public void setSalesprices(double salesprices) {
        this.salesprices = salesprices;
    }

    public double getBuyprices() {
        return buyprices;
    }

    public void setBuyprices(double buyprices) {
        this.buyprices = buyprices;
    }
    //endregion
}

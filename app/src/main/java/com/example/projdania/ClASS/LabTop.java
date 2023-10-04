package com.example.projdania.ClASS;

public class LabTop extends Product {

    public LabTop(int pid, String prodname, String proddisc, byte prodimg, int stock, double saleprice, double buyprice) {
        super(pid, prodname, proddisc, new byte[]{prodimg}, stock, saleprice, buyprice);
    }
}

package com.example.projdania.ClASS;

public class PC extends Product {

    public PC(int pid, String prodname, String proddisc, byte prodimg, int stock, double saleprice, double buyprice) {
        super(pid, prodname, proddisc, new byte[]{prodimg}, stock, saleprice, buyprice);
    }
}

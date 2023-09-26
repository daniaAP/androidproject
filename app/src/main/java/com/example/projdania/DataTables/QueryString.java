package com.example.projdania.DataTables;


import com.example.projdania.DataTables.TablesString.*;
    public class QueryString {


        //region Create Tables
        public static final String SQL_CREATE_PRODUCT =
                "CREATE TABLE " + TablesString.TablesString.ProductTable.TABLE_PRODUCT + " (" +
                        TablesString.TablesString.ProductTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        TablesString.TablesString.ProductTable.COLUMN_PRODUCT_NAME + " TEXT," +
                        TablesString.TablesString.ProductTable.COLUMN_PRODUCT_DESCRIPTION + " TEXT," +
                        TablesString.TablesString.ProductTable.COLUMN_PRODUCT_STOCK + " INTEGER," +
                        TablesString.TablesString.ProductTable.COLUMN_PRODUCT_SALEPRICE + " DOUBLE,"+
                        TablesString.TablesString.ProductTable.COLUMN_PRODUCT_BUYPRICE + " DOUBLE,"+
                        TablesString.TablesString.ProductTable.COLUMN_PRODUCT_IMAGE + " BLOB);";

        public static final String SQL_CREATE_CART =
                "CREATE TABLE " + TablesString.TablesString.CartTable.TABLE_CART + " (" +
                        TablesString.TablesString.CartTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        TablesString.TablesString.CartTable.COLUMN_PRODUCT_ID + " TEXT," +
                        TablesString.TablesString.CartTable.COLUMN_USER_ID + " TEXT);";

        public static final String SQL_CREATE_SALE =
                "CREATE TABLE " + TablesString.TablesString.SaleTable.TABLE_SALE + " (" +
                        TablesString.TablesString.SaleTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        TablesString.TablesString.SaleTable.COLUMN_SALE_PROD_ID + " INTEGER," +
                        TablesString.TablesString.SaleTable.COLUMN_SALE_USER_ID + " TEXT,"+
                        TablesString.TablesString.SaleTable.COLUMN_SALE_PRICE + " DOUBLE,"+
                        TablesString.TablesString.SaleTable.COLUMN_BUY_PRICE + " DOUBLE);";

        //endregions

        //region Delete Tables

        public static final String SQL_DELETE_PRODUCT =
                "DROP TABLE IF EXISTS " + TablesString.TablesString.ProductTable.TABLE_PRODUCT;

        public static final String SQL_DELETE_CART =
                "DROP TABLE IF EXISTS " + TablesString.TablesString.CartTable.TABLE_CART;

        public static final String SQL_DELETE_SALE =
                "DROP TABLE IF EXISTS " + TablesString.TablesString.SaleTable.TABLE_SALE;

        //endregion
    }

}

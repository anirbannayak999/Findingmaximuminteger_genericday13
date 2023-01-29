package com.bridgelabz;

public class stock {

    private String stockName;
    private int noOfStock;
    private double sharePrice;
    private double stockValue;


    public String getStockName() {
        return stockName;
    }


    public void setStockName(String stockName) {
        this.stockName = stockName;
    }


    public int getNoOfStock() {
        return noOfStock;
    }


    public void setNoOfStock(int noOfStock) {
        this.noOfStock = noOfStock;
    }


    public double getSharePrice() {
        return sharePrice;
    }


    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }


    public double getStockValue() {
        return stockValue;
    }


    public void setStockValue(double stockValue) {
        this.stockValue = stockValue;
    }


    @Override
    public String toString() {
        return "Stock Details :- [stockName=%s, noOfStock=%d, sharePrice=%s, stockValue=%snull".formatted(stockName, noOfStock, sharePrice, stockValue);


    }}
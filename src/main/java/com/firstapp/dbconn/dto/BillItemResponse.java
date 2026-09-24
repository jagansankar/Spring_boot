package com.firstapp.dbconn.dto;

public class BillItemResponse {

    private int id;

    private String name;

    private double price;

    private String expiryDate;

    private int quantity;

    private double total;

    public BillItemResponse(
            int id,
            String name,
            double price,
            String expiryDate,
            int quantity,
            double total) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }
}
package com.firstapp.dbconn.dto;

public class BillItemRequest {

    private int productId;

    private int quantity;

    public BillItemRequest() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
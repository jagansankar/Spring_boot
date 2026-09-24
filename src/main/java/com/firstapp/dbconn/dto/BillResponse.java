package com.firstapp.dbconn.dto;

import java.util.List;

public class BillResponse {

    private List<BillItemResponse> items;

    private double totalBill;

    public BillResponse(
            List<BillItemResponse> items,
            double totalBill) {

        this.items = items;
        this.totalBill = totalBill;
    }

    public List<BillItemResponse> getItems() {
        return items;
    }

    public double getTotalBill() {
        return totalBill;
    }
}
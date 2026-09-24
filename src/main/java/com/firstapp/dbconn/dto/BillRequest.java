package com.firstapp.dbconn.dto;

import java.util.List;

public class BillRequest {

    private List<BillItemRequest> items;

    public BillRequest() {
    }

    public List<BillItemRequest> getItems() {
        return items;
    }

    public void setItems(List<BillItemRequest> items) {
        this.items = items;
    }
}
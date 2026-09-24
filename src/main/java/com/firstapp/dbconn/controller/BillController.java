package com.firstapp.dbconn.controller;

import com.firstapp.dbconn.dto.BillRequest;
import com.firstapp.dbconn.dto.BillResponse;
import com.firstapp.dbconn.service.BillService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BillController {

    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @PostMapping("/bill")
    public BillResponse createBill(
            @RequestBody BillRequest request) {

        return billService.createBill(request);
    }
}
package com.firstapp.dbconn.service;

import com.firstapp.dbconn.dto.BillItemRequest;
import com.firstapp.dbconn.dto.BillItemResponse;
import com.firstapp.dbconn.dto.BillRequest;
import com.firstapp.dbconn.dto.BillResponse;
import com.firstapp.dbconn.entity.Product;
import com.firstapp.dbconn.exception.ProductNotFoundException;
import com.firstapp.dbconn.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillService {

    private final ProductRepository productRepository;

    public BillService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public BillResponse createBill(BillRequest request) {

        List<BillItemResponse> responseItems =
                new ArrayList<>();

        double totalBill = 0;

        for (BillItemRequest item : request.getItems()) {

            // Validate quantity
            if (item.getQuantity() <= 0) {

                throw new IllegalArgumentException(
                        "Quantity must be greater than 0"
                );
            }

            // Find product
            Product product = productRepository
                    .findById(item.getProductId())
                    .orElseThrow(() ->
                            new ProductNotFoundException(
                                    "Product with ID "
                                            + item.getProductId()
                                            + " not found"
                            )
                    );

            // Calculate item total
            double total =
                    product.getPrice()
                            * item.getQuantity();

            // Create response item
            BillItemResponse responseItem =
                    new BillItemResponse(
                            product.getId(),
                            product.getName(),
                            product.getPrice(),
                            product.getExpiryDate(),
                            item.getQuantity(),
                            total
                    );

            responseItems.add(responseItem);

            // Add to final bill
            totalBill = totalBill + total;
        }

        return new BillResponse(
                responseItems,
                totalBill
        );
    }
}
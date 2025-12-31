package com.dev.jeeva.orderservice.controller;

import com.dev.jeeva.orderservice.client.InventoryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final InventoryClient inventoryClient;

    public OrderController(InventoryClient inventoryClient) {
        this.inventoryClient = inventoryClient;
    }

    @GetMapping("/status")
    public String getStatus() {
        String inventoryData = inventoryClient.getHelloFromInventory();
        return "Order Service is LIVE. Inventory says: " + inventoryData;
    }
}
package com.dev.jeeva.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "inventory-service")
public interface InventoryClient {
    @GetMapping("/hello")
    String getHelloFromInventory();
}

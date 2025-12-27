package com.example.payment.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "wallet-service")
public interface WalletClient {

  @PostMapping("/wallet/debit/{userId}/{amount}")
  String debit(@PathVariable String userId, @PathVariable double amount);
}
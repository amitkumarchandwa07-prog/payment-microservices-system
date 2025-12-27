package com.example.payment.controller;

import com.example.payment.client.WalletClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

  private final WalletClient walletClient;

  public PaymentController(WalletClient walletClient) {
    this.walletClient = walletClient;
  }

  @PostMapping("/pay/{userId}/{amount}")
  public String pay(@PathVariable String userId, @PathVariable double amount) {
    return walletClient.debit(userId, amount);
  }
}
package com.example.wallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wallet.service.WalletService;

//@RestController
//@RequestMapping("/wallet")
//public class WalletController {
//
//  @GetMapping("/balance/{userId}")
//  public double balance(@PathVariable String userId) {
//    return 1000.0;
//  }
//
//  @PostMapping("/debit/{userId}/{amount}")
//  public String debit(@PathVariable String userId, @PathVariable double amount) {
//    return "DEBIT_SUCCESS";
//  }
//}

@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @PostMapping("/debit/{userId}/{amount}")
    public String debit(@PathVariable String userId,
                        @PathVariable double amount) {
        walletService.debit(userId, amount);
        return "DEBIT_SUCCESS";
    }

    @GetMapping("/balance/{userId}")
    public double balance(@PathVariable String userId) {
        return walletService.getBalance(userId);
    }
}

package com.example.wallet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.wallet.entity.Wallet;
import com.example.wallet.repository.WalletRepository;

@Service
public class WalletService {

    @Autowired
    private WalletRepository repo;

    @Transactional
    public void debit(String userId, double amount) {

        Wallet wallet = repo.findByUserId(userId).orElseThrow(() -> new RuntimeException("Wallet not found"));

        if (wallet.getBalance() < amount) {
            throw new RuntimeException("Insufficient balance");
        }

        wallet.setBalance(wallet.getBalance() - amount);
        repo.save(wallet);
    }

    public double getBalance(String userId) {
        return repo.findByUserId(userId) .orElseThrow(() -> new RuntimeException("Wallet not found"))
            .getBalance();
    }
}

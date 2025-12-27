package com.example.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.wallet.entity.Wallet;
import java.util.Optional;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
    Optional<Wallet> findByUserId(String userId);
}

package com.example.Demo.demo.repository;

import com.example.Demo.demo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRepository
        extends JpaRepository<Account, Integer> {
}
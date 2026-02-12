package com.example.Demo.demo.controller;

import com.example.Demo.demo.entity.Account;
import com.example.Demo.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public Page<Account> getAll(Pageable pageable) {
        return accountService.getAllAccounts(pageable);
    }

    @GetMapping("/search")
    public Page<Account> search(
            @RequestParam(required = false) String username,
            @RequestParam(required = false) Integer departmentId,
            @RequestParam(required = false) Integer positionId,
            Pageable pageable) {

        return accountService.searchAccounts(username, departmentId, positionId, pageable);
    }

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Integer id) {
        return accountService.getAccountById(id);
    }

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @PutMapping("/{id}")
    public Account updateAccount(
            @PathVariable Integer id,
            @RequestBody Account account) {
        return accountService.updateAccount(id, account);
    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable Integer id) {
        accountService.deleteAccount(id);
    }
}

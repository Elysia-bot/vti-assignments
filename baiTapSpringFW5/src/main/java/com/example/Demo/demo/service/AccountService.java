package com.example.Demo.demo.service;

import com.example.Demo.demo.entity.Account;
import com.example.Demo.demo.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private IAccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccountById(Integer id) {
        return accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Account not found"));
    }

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account updateAccount(Integer id, Account account) {
        Account old = getAccountById(id);
        old.setEmail(account.getEmail());
        old.setUsername(account.getUsername());
        old.setFullName(account.getFullName());
        old.setDepartment(account.getDepartment());
        old.setPosition(account.getPosition());
        return accountRepository.save(old);
    }

    public void deleteAccount(Integer id) {
        accountRepository.deleteById(id);
    }

    public Page<Account> getAllAccounts(Pageable pageable) {
        return accountRepository.findAll(pageable);
    }

    public Page<Account> searchAccounts(
            String username,
            Integer departmentId,
            Integer positionId,
            Pageable pageable) {

        if (username != null) {
            return accountRepository.findByUsernameContaining(username, pageable);
        }

        if (departmentId != null) {
            return accountRepository.findByDepartmentId(departmentId, pageable);
        }

        if (positionId != null) {
            return accountRepository.findByPositionId(positionId, pageable);
        }

        return accountRepository.findAll(pageable);
    }
}

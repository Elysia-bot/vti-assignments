package com.example.Demo.demo.repository;

import com.example.Demo.demo.entity.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRepository
        extends JpaRepository<Account, Integer> {
    Page<Account> findByUsernameContaining(String username, Pageable pageable);

    Page<Account> findByDepartmentId(Integer departmentId, Pageable pageable);

    Page<Account> findByPositionId(Integer positionId, Pageable pageable);
}
package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Account;

public interface AccountRepo extends JpaRepository<Account,Integer>{
    
}
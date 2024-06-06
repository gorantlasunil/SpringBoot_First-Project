package com.jsp.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.mapping.entity.BankAccount;

public interface BankRepository extends JpaRepository<BankAccount,Integer>{

}

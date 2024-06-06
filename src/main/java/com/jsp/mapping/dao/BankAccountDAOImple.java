package com.jsp.mapping.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.mapping.entity.BankAccount;
import com.jsp.mapping.repository.BankRepository;
@Component
public class BankAccountDAOImple implements BankAccountDAO{

	@Autowired
	private BankRepository repository; 
	
	@Override
	public BankAccount saveBanAccount(BankAccount account) {
		return repository.save(account);
	}

}

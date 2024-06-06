package com.jsp.mapping.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.mapping.dto.EmployeeDTO;
import com.jsp.mapping.entity.Employee;
import com.jsp.mapping.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplem  implements EmployeeService{

     @Autowired	
	private EmployeeRepository repository;
	@Override
	public EmployeeDTO fetchByEmployeeId(int id) {

		//call method from repository
		Optional<Employee> optional = repository.findByEmployeeId(id);
		//to check wheather record present or not
		if(optional.isPresent())
		{
			//to retrive the data......
			Employee employeeFromDB = optional.get();
			
			//to transfer data from entity to dTO.........
	      
			
	}
		return null;
	}

}

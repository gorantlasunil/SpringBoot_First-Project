package com.jsp.mapping.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.mapping.entity.Employee;
import com.jsp.mapping.repository.EmployeeRepository;
@Component
public class EmployeeDAOImple implements EmployeeDAO {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public int saveEmployee(Employee e1) {
		Employee employee = repository.save(e1);
		return employee.getEid();
	}
	

}

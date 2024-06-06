package com.jsp.mapping.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jsp.mapping.dto.EmployeeDTO;
import com.jsp.mapping.service.EmployeeService;

@SpringBootApplication
public class DTUsage {

	public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(DTUsage.class, args);		

		 EmployeeService service = context.getBean(EmployeeService.class);
		 
		 EmployeeDTO dto = service.fetchByEmployeeId(1);
		 if (dto!=null) {
			
			 System.out.println("Ename"+dto.getEname());
			 System.out.println("AccountNo: "+dto.getBankaccount().getAccountNo());
		}
		 else {
			System.out.println("No records Found");
		}
	}
	

}
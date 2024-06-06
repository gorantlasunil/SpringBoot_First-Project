package com.jsp.mapping.dto;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class EmployeeDTO {

	private String ename;
	private double salary;
	private BankAccountDTO bankaccount;
	
}

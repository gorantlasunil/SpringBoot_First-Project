package com.jsp.mapping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import antlr.collections.List;
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
@Table(name="emp_table")
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	private double salary;
	
	
	//mapping
	//to enable opertion of bankAcoount class
	@OneToOne(cascade = CascadeType.ALL)
	//to modify foreign coloum name
	@JoinColumn(name="bankAccountNo")
	private BankAccount account;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "employee")
	java.util.List<Address> addresses;
	
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	java.util.List<TechnicalSkills> skills;
	
}

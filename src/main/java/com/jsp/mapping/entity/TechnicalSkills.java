package com.jsp.mapping.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name="teckSkill_table")
@Entity
@Builder

public class TechnicalSkills {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int skillId;
	private String skillName;
	
	@ManyToMany(cascade = CascadeType.ALL , mappedBy = "skills")
	List<Employee> employees;
}

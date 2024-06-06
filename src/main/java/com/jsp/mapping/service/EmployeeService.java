package com.jsp.mapping.service;
import com.jsp.mapping.dto.EmployeeDTO;


public interface EmployeeService {

  EmployeeDTO fetchByEmployeeId(int id);
}

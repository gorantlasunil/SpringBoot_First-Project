package com.jsp.mapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jsp.mapping.dao.BankAccountDAO;
import com.jsp.mapping.dao.EmployeeDAO;
import com.jsp.mapping.entity.BankAccount;
import com.jsp.mapping.entity.Employee;

@SpringBootApplication
public class HibernatemappingpracticeprojectApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context =	SpringApplication.run(HibernatemappingpracticeprojectApplication.class, args);
	
//	EmployeeDAO dao = context.getBean(EmployeeDAO.class);
	 /*Employee emp = new Employee();
	 
	 BankAccount account = new BankAccount();

	 account.setAccountNo("SBI-123456789");
	 account.setIFSCode("SBI-0007");
	 emp.setEid(1);
	 emp.setEname("Sunil");
	 emp.setSalary(30000);
	 */
	
//	BankAccount a1 = BankAccount.builder().accountNo("SBI-123456789").IFSCode("SBI-0007").build();
	 
	//to unidirectional 
	//to insert values of bankaccount to employeee
       /*	Employee emp = Employee.builder()
       			.eid(1).ename("Sunil").salary(30000)
       			.account(BankAccount.builder().accountNo("SBI-123456789").IFSCode("SBI-0007").build())
       			.build();
       	
       	int saveEmployee = dao.saveEmployee(emp);
       	System.out.println("saveEmployee iD"+saveEmployee);
	*/
	
	//bidectional mens transfer data into viceverse
	//to insert date or any operation from employee to bankaccount 
	
	// to insert forienkey is not possiable
	/*BankAccount account1 = new BankAccount();
	Employee emp2 = new Employee();
	
	  BankAccount bankaccount = account1.builder()
			  .accountNo("HDFC-87653234").IFSCode("HDFC-7252").employee(Employee.builder().ename("sunny").salary(3432).build())
			  .build();
			  */
	
	//to insert forienkey also
	
//	BankAccountDAO accountDao = context.getBean(BankAccountDAO.class);
//	Employee e2 = Employee.builder().ename("Anil").salary(37093)
//			.build();
//	
//	BankAccount b1 = BankAccount.builder().accountNo("HDFC-7556782").IFSCode("HDFC=9762")
//			.employee(e2)
//			.build();
//	e2.setAccount(b1);//to insert id of bankaccount in employee table.............
////	System.out.println("bankaccount is is"+accountDao.saveBanAccount(b1));
//	
	}

}

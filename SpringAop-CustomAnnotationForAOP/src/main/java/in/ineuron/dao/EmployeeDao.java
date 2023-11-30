package in.ineuron.dao;

import org.springframework.stereotype.Component;

import in.ineuron.annotation.MyTransaction;

@Component
public class EmployeeDao {

	@MyTransaction
	public Integer saveEmployee() {	
		System.out.println("Employee object is saved....");
		return 5;
	}
	
}

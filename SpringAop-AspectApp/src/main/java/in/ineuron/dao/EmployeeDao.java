package in.ineuron.dao;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

	public String saveEmployee() {
		int a=8;
		if(a-5==0)
			throw new ArithmeticException("Dummy exception...");
		System.out.println("Employee Object is saved...");
		return "Employee data saved with id 5";
	}
	
}

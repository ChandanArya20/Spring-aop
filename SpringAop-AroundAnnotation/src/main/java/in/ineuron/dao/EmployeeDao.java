package in.ineuron.dao;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

	public Integer saveEmployee() {
		
		System.out.println("Employee object is saved....");
		return 5;
	}
	
}

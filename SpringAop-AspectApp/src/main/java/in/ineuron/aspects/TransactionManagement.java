package in.ineuron.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionManagement {

	@Pointcut("execution(public * in.ineuron.dao.EmployeeDao.saveEmployee())")
	private void m() {}
	
	@Before("m()")
	public void beginTransaction() {
		System.out.println("Transaction started...");
	}
	
	@AfterReturning(value="m()",returning = "obj")
	public void commitTransaction(Object obj) {
		System.out.println("Transaction commited...");
		System.out.println("Data is "+obj);
	}
	
	@AfterThrowing(value="m()",throwing = "obj" )
	public void rollbackTransaction(Throwable obj) {
		System.out.println("Transaction rollbaked..."+obj.getMessage());
	}
		
	
	@After("m()")
	public void ansaction() {
		System.out.println("*** E-mail setup id done ***");
	}
}

package in.ineuron.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionManagement2 {

	@Pointcut("execution(* in.ineuron.dao.*.saveEmployee())")
	public void m1() {}
	
	@Pointcut("execution(* in.ineuron.dao.*.deleteEmployee())")
	public void m2() {}
	
	@Pointcut("m1() || m2()")
	public void operation() {}
		
	@Before("operation()")
	public void beginTransaction() {
		System.out.println("Transaction started...");
	}
	
	@After("operation()")
	public void commitTransaction() {
		System.out.println("Transaction commited...");
	}
}

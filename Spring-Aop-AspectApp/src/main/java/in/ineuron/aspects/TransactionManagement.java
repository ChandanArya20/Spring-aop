//package in.ineuron.aspects;
//
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class TransactionManagement {
//
//	@Pointcut("execution(public void in.ineuron.dao.EmployeeDao.saveEmployee())")
//	private void m() {}
//	
//	@Before("m()")
//	public void beginTransaction() {
//		System.out.println("Transaction started...");
//	}
//	
//	@After("m()")
//	public void commitTransaction() {
//		System.out.println("Transaction commited...");
//	}
//}

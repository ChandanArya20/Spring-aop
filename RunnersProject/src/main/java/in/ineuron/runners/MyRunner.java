package in.ineuron.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("MyRunner.run()");
		
		System.out.println("arrgs[0]  :: "+args[0]);
		System.out.println("Aruments are : "+Arrays.asList(args));
		

	}

}

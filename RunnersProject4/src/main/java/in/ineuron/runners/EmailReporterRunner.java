package in.ineuron.runners;

import java.util.Arrays;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class EmailReporterRunner implements ApplicationRunner {

	@Value("${spring.application.name}")
	String name;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println(name);
	}

}

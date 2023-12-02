package in.ineuron.runners;

import java.util.Arrays;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class EmailReporterRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("EmailReporterRunner.run()");
		
		System.out.println("From application runner : "+Arrays.asList(args.getSourceArgs()));
		
		System.out.println("Non-optional args : "+args.getNonOptionArgs());
		
		System.out.println("Optional args : "+args.getOptionNames());
		
		Set<String> optionNames = args.getOptionNames();
		for(String optionName:optionNames) {
			
			System.out.println(optionName+" : "+args.getOptionValues(optionName));
		}
		
		if(args.getNonOptionArgs().contains("start")) {
			System.out.println("Start taking email dump...");
		}
	}

}

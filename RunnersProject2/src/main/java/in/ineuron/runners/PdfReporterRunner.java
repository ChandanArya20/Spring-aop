package in.ineuron.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class PdfReporterRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("PdfReporterRunner.run()");		
		System.out.println("arrgs[0]  :: "+args[0]);
		System.out.println("Aruments are : "+Arrays.asList(args));

	}

}

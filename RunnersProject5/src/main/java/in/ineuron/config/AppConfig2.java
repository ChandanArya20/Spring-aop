package in.ineuron.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
	
	@Bean
	public CommandLineRunner runA() {
		
		return (args)->System.out.println("Hello : "+Arrays.asList(args));
		
	}

}

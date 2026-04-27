package springconfiguration.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Profile("prod")
public class RealEmailService {
	
	@Value("${username}")
	String username;
	
	@Value("${password}")
	String password;
	
	
	
	@PostConstruct
	void check() {
		System.out.println("username  : " + username + " password : " + password);
	}


}

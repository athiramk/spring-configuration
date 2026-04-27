package springconfiguration.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class User {
	
	@Autowired
	Order order;
	
	
	
	@PostConstruct
	void check() {
		order.createOrder();
	}

}

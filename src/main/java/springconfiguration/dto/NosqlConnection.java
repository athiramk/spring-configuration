package springconfiguration.dto;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "nosqlconnection", value = "enabled", havingValue = "true", matchIfMissing = false)
public class NosqlConnection {
	
	public NosqlConnection() {
		System.out.println("NosqlConnetion Initialised");
	}

}

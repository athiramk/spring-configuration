package springconfiguration.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springconfiguration.dto.OfflineOrder;
import springconfiguration.dto.OnlineOrder;
import springconfiguration.dto.Order;

@Configuration
public class AppConfig {
	
	@Bean
	Order createOrderBean(@Value("${isOnlineOrder}") boolean isOnlineOrder) {
		if(isOnlineOrder)
			return new OnlineOrder();
		else
			return new OfflineOrder();
	}

}

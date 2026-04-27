package springconfiguration.dto;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;

@Component
@ConditionalOnProperty(prefix = "mysqlconnection", value = "enabled", havingValue = "true", matchIfMissing = false)
public class MysqlConnection {
	

	@Value("${username}")
	String username;
	
	@Value("${password}")
	String password;
	
	public MysqlConnection() {
		System.out.println("MysqlConnection Initialised");

	}
	

}

package springconfiguration.dto;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DBConnection {
	
	@Autowired(required = false)
	MysqlConnection mysqlConnection;
	
	@Autowired(required = false)
	NosqlConnection nosqlConnection;
	
	
	public DBConnection() {
		System.out.println("DBConnection Initialised");
		
	} 
	
	@PostConstruct
	void check() {
		
		System.out.println("Is mysqlConnection null? : " + Objects.isNull(mysqlConnection));
		System.out.println("Is nosqlConnection null? : " + Objects.isNull(nosqlConnection));
		
	}

}

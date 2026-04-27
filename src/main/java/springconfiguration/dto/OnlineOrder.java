package springconfiguration.dto;

public class OnlineOrder implements Order {
	
	public OnlineOrder() {
		System.out.println("Online order initialised");
	}

	@Override
	public void createOrder() {
		System.out.println("Online Order created");
		
	}

}

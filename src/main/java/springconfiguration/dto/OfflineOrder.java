package springconfiguration.dto;


public class OfflineOrder implements Order {

	public OfflineOrder() {
		System.out.println("Offline Order Initialised");
	}

	@Override
	public void createOrder() {
		System.out.println("Oflline Order created");
		
	}
}

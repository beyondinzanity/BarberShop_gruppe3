
public class Shop {
	
	public static void main(String[] args) throws InterruptedException {
		Barber barber = new Barber();
		Customer customer = new Customer(barber);
		
		
		customer.start();
		barber.start();
		
		barber.join();
		customer.join();
		
		
	}
	

	
	

}


public class Customer extends Thread {
	
	Barber barber;
	
	public Customer(Barber barber) {
		this.barber = barber;
	}
	
	@Override
	public void run() {
		try {
		while(true) {
			//barber.cutHair();
			String customer = barber.cutHair();
			//System.out.println(customer + ": got his hair cut by " + barber.getName());
			
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
}

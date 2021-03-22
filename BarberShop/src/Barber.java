import java.util.ArrayList;
import java.util.List;

public class Barber extends Thread {
	private static final int maxSize = 5;
	private static int count = 1;
	private static List<String> chairs = new ArrayList<>();
	
	public Barber() {
		this.setName("Picke Nick");
		
	}
	
	@Override
	public void run() {
		try {
		while(true) {
			enterShop();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private synchronized void enterShop() throws Exception {
		//Thread.sleep(250);
		while(chairs.size() == maxSize) {
				System.out.println("Customer waiting to enter");
				wait();	
		}

		String customer = "customer " + count++;
				
		chairs.add(customer);
		System.out.println(customer + " has entered barber shop");
		
		notify();
	}

	public synchronized String cutHair() throws Exception {
		while(chairs.isEmpty()) {
				System.out.println("Barber is sleeping");
				wait(); 
		}
		
		String customer = chairs.get(0);
		chairs.remove(customer);
		System.out.println(customer + ": got his hair cut by " + this.getName());
		
		notify();		
		return customer;
	
	}
	
	

}

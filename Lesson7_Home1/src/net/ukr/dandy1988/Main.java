package net.ukr.dandy1988;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boat a1 = new Boat(1);
		Boat a2 = new Boat(2);
		Boat a3 = new Boat(3);
		
		a1.setCargo(10);
		a2.setCargo(10);
		a3.setCargo(10);
		
		Thread One = new Thread (a1);
		Thread Two = new Thread (a2);
		Thread Three = new Thread (a3);
		
		One.start();
		Two.start();
		
		try {
			One.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Two.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Three.start();
		
		
		
		
	}

}

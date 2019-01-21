package net.ukr.dandy1988;

public class Boat extends Cargo implements Runnable {
	private int numberOfBoat;
		
	public Boat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Boat(int numberOfBoat) {
		this.numberOfBoat = numberOfBoat;
	}

	public int getNumberOfBoat() {
		return numberOfBoat;
	}

	public void setNumberOfBoat(int numberOfBoat) {
		this.numberOfBoat = numberOfBoat;
	}

	@Override
	public String toString() {
		return "Boat [numberOfBoat=" + numberOfBoat + "; cargo =" + getCargo()+"]";
	}

	public synchronized void takeCargo() {
		if (getCargo() > 0) {
			decCargo();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e){
				System.out.println(e);
			}

		} else {
			System.out.println("Boat " + this.numberOfBoat+" empty");
		}
	}
	
	public void run() {
		for (int i = 0; i < 11; i++) {
			takeCargo();
			if (getCargo()>0) {
				System.out.println(toString());
			}
		}
	}
	
}

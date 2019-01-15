package net.ukr.dandy1988;

public class Main {

	public static void main(String[] args) {
		
		FactorialTask [] a = new FactorialTask [100];
		
		for (int i = 0; i < a.length; i++) {
			FactorialTask aset = new FactorialTask(i);
			a[i] = aset;
		}
		
		Thread [] flows = new Thread [100];
		
		for (int i = 0; i < flows.length; i++) {
			Thread fl = new Thread (a[i]);
			flows [i] = fl;
		}

		for (int i = 0; i < flows.length; i++) {
			flows[i].start();
		}
		
	}

}

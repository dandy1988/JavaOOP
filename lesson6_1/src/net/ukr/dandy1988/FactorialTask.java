package net.ukr.dandy1988;

import java.math.BigInteger;

public class FactorialTask implements Runnable{
	
	private int number;

	public FactorialTask(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public BigInteger calculateFactorial(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i<=n; i++) {
			fact = fact.multiply(new BigInteger(""+i));
		}
		return fact;
	}
	@Override
	public void run() {
		Thread thr = Thread.currentThread();
//		for (int i = 1; i <= this.number; i++) {
//			if (thr.isInterrupted()) {
//				System.out.println(thr.getName()+" Interrupt");
//				return;
//			}
//			System.out.println(thr.getName()+"\t"+i+ " !="+calculateFactorial(i));
//		}
		
		if (thr.isInterrupted()) {
		System.out.println(thr.getName()+" Interrupt");
		return;
		}
		System.out.println(thr.getName()+"\t"+this.number+ " !="+calculateFactorial(this.number));
	}
}

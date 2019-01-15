package net.ukr.dandy1988;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int a [] = new int [1000];
		
		for (int i = 0; i < a.length; i++) {
			double b = Math.random()*10000;
			a[i] = (int) b;
		}
		
		CountArray taskOne = new CountArray(0,250,a);
		CountArray taskTwo = new CountArray(250,500,a);
		CountArray taskThree = new CountArray(500,750,a);
		CountArray taskFour = new CountArray(750,1000,a);
		
		Thread threadOne = new Thread(taskOne);
		Thread threadTwo = new Thread(taskTwo);
		Thread threadThree = new Thread(taskThree);
		Thread threadFour = new Thread(taskFour);
		
		threadOne.start();
		threadTwo.start();
		threadThree.start();
		threadFour.start();
		
		int sum = 0;

		for (; threadOne.isAlive() == true; ) {	
		}
		for (; threadTwo.isAlive() == true; ) {	
		}
		for (; threadThree.isAlive() == true; ) {	
		}
		for (; threadFour.isAlive() == true; ) {	
		}
		
		sum = taskOne.getResult() + taskTwo.getResult() + taskThree.getResult() + taskFour.getResult();
				
		System.out.println("first sum" + taskOne.getResult());		
		int sum1 = 0;
		for (int i = 0; i < 250; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("first sum check" + sum1);		

		System.out.println("second sum" + taskTwo.getResult());		
		sum1 = 0;
		for (int i = 250; i < 500; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("second sum check" + sum1);
		
		System.out.println("third sum" + taskThree.getResult());		
		sum1 = 0;
		for (int i = 500; i < 750; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("third sum check" + sum1);		

		System.out.println("4 sum" + taskFour.getResult());		
		sum1 = 0;
		for (int i = 750; i < 1000; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("4 sum check" + sum1);			
		
		System.out.println("Sum of the array =" + sum);
		
		//check
		int sumCheck = 0;
		for (int i = 0; i < a.length; i++) {
			sumCheck = sumCheck + a[i];
		}
		
		System.out.println("Check of sum of the array =" + sumCheck);
	}



}

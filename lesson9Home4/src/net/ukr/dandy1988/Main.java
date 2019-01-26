package net.ukr.dandy1988;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayDeque<String> queue=new ArrayDeque<String>();
		
	
		queue.push("Sheldon");
		queue.push("Leonard");	
		queue.push("Volovic");
		queue.push("Kutrapalli");
		queue.push("Penni");
		

		System.out.println("Queue:");
		for (String string : queue) {
			System.out.println(string);
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input amount bottles of cola: ");
		int amount = sc.nextInt();
		
		for (int i = 0; i < amount; i++) {			
			String first = queue.pollLast();
			queue.push(first);		
			queue.push(first);
		}
		
		System.out.println();
		System.out.println("New queue:");
		for (String string : queue) {
			System.out.println(string);
		}

	}

}

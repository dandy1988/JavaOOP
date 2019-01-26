package net.ukr.dandy1988;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List <Element> myList = new ArrayList<>();
		
		int s = 65;
		for (int i = 0; i < 26; i++) {
			char st = (char) s;
			Element el = new Element(0, st);
			myList.add(el);
			s++;
		}
		
		s = 97;
		for (int i = 26; i < 52; i++) {
			char st = (char) s;
			Element el = new Element(0, st);
			myList.add(el);
			s++;
		}

//		for (int i = 0; i < myList.size(); i++) {
//			System.out.println(myList.get(i));
//		}
		
		File file = new File ("src/net/ukr/dandy1988/Main.java");

		System.out.println("Text from file:");
		System.out.println();
		
		String c = "";
		try (Scanner sc = new Scanner (file)){
			for (;sc.hasNextLine();) {
				c = sc.nextLine();
				Element compare = new Element();
				for (int i = 0; i < c.length(); i++) {
					for (int j = 0; j < 52; j++) {
						compare = myList.get(j);
						if (compare.getB() == c.charAt(i)) {
							int number = compare.getA()+1;
							compare.setA(number);
							myList.set(j, compare);
						}
					}
				}
				System.out.println(c);
			}		
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	
		myList.sort(Comparator.comparing(Element::getA).reversed());
		
		System.out.println();
		System.out.println("Symbols have ordered:");
			
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}

}
}

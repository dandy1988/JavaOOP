package net.ukr.dandy1988;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List <Element> myList = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			String st = "Empty" +i;
			Element el = new Element(i, st);
			myList.add(el);
		}
		
		Element erase = new Element();
		erase = myList.remove(0);
		erase = myList.remove(0);
		
		if (myList.size()>0) {
			erase = myList.remove(myList.size() - 1);
		}

		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
	}

}

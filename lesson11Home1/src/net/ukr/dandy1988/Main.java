package net.ukr.dandy1988;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		String url = "https://prog.kiev.ua/";
//		String result = "";
//
//		try {
//			result = InetWork.getStringFromURL(url, "UTF-8");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(result);
//		
//		String url = "https://prog.kiev.ua/images/content/cl-10.jpg";
//		File folder = new File ("AAA");
//		folder.mkdirs();
//		
//		try {
//			InetWork.getFileFromURL(url, folder);
//			System.out.println("Done");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		File file = new File ("src/net/ukr/dandy1988/urls.txt");
		
		String url = "";
		try (Scanner sc = new Scanner (file)){
			for (;sc.hasNextLine();) {
				url = sc.nextLine();
				if (url.charAt(0) != 'h') {
					url = sc.nextLine();
				}
				InetWork a = new InetWork();
				int ans = 0;
				try {
					ans = a.getAnswer(url);
				} catch (Exception e) {
				}
				if (ans != -1) {
					System.out.println(url + "  is accesible");
				} else {
					System.out.println(url + " - no connection");
				}
			}
		} catch (Exception e) {
		}
		
		
		
	}
	


}

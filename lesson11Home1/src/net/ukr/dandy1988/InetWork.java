package net.ukr.dandy1988;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class InetWork {

	public InetWork() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static int getAnswer(String url) {
		try {
			URL urlCon = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) urlCon.openConnection();	
			connection.getResponseCode();
			return 1;
		} catch (Exception e) {
			return -1;
		}	
	}
	

}

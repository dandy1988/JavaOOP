package net.ukr.dandy1988;

import java.io.*;
import java.net.*;

public class Server implements Runnable{
	private Socket soc;
	private String ansv;
	private Thread t;
	private int number;
	
	public Server(Socket soc, String ansv, int number) {
		super();
		this.soc = soc;
		this.ansv = ansv;
		this.number = number;
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		try (InputStream is = soc.getInputStream();OutputStream os = soc.getOutputStream();PrintWriter pw = new PrintWriter(os)) {
			byte[] rec1 = new byte[is.available()];
			is.read(rec1);
			String response = "HTTP/1.1 200 OK\r\n" + "Server: My_Server\r\n" + "Content-Type:text/html\r\n"+ "Content-Length: " + "\r\n" + "Connection: close\r\n\r\n";
			ansv += "your request number = " + number;
			ansv += "</body></html>";
			
			pw.print(response + ansv);
			pw.flush();
		} catch (IOException e) {
		System.out.println(e.toString());
		}
	}
		

}

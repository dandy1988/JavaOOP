package net.ukr.dandy1988;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) {

		String ansver = "";
		
		Runtime run = Runtime.getRuntime();
		
		ansver += "<html><body> total memory = " + run.totalMemory() + "<br>";
		ansver += "free memory = " + run.freeMemory()+ "<br>";

		int number = 0; 


		try (ServerSocket soc = new ServerSocket(1010)) {
			for (;;) {
				Socket clisoc = soc.accept();
				number++;
				Server cli = new Server(clisoc, ansver, number);	
			}
		} catch (IOException e) {
			System.out.println("Error to server Socket Open!!!");
		}

	}

}

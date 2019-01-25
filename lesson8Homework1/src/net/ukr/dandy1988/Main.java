package net.ukr.dandy1988;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group ds51 = new Group();

		for (int k = 9; k >= 0; k--) {
			ds51.addStudent("Ivan" + k, "Ivanov" + k, 15 + k, "male", "DS-51");
		}

		Arrays.sort(ds51.getGroupOfStudents());
		
		System.out.println("Hello, input name of file of students group(example:students.dat):");
		Scanner sc = new Scanner(System.in);
		String nameFile = sc.nextLine();
		
		Group[] groups= new Group[] {ds51, ds51};

		for (Group group : groups) {
			System.out.println(group.toString());
		}
		
		File file = new File ("students.dat");
		
		try {
			Serializator.saveObjectToFileArray(groups, file);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
//		System.out.println("Hello, input name of file of students group(students.dat):");
//		Scanner sc = new Scanner(System.in);
//		String nameFile = sc.nextLine();
		
		file = new File (nameFile);
		
		Group groupBackRepair[] = new Group [2];
		
		try {
			groupBackRepair = Serializator.loadObjectFromFileArray(file, groupBackRepair.length);
			
		}catch (ClassNotFoundException|IOException e) {
			e.printStackTrace();
		}

		System.out.println("\n" + "Array of students from file" + "\n");

		for (Group group : groupBackRepair) {
			System.out.println(group.toString());
		}

	}

}

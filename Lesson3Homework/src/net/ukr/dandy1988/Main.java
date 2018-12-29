package net.ukr.dandy1988;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group ds51 = new Group();

		for (int k = 8; k >= 0; k--) {
			ds51.addStudent("Ivan" + k, "Ivanov" + k, 15 + k, "male", "DS-51");
		}

//		ds51.addStudent("Andrew", "Ivanov", 12, "male", "DM-51");

		// ds51.deleteStudent("Ivanov1");

		// ds51.deleteStudent("Danilov");

		// System.out.println(ds51.findStudent("Ivanov2"));
		
		System.out.println(ds51.toString());
		
		System.out.println("Please, add student");

		 if (ds51.addStudentInteractive() == 1) {
		 System.out.println("\n" + "Student have added" + "\n");
		 } else {
		 System.out.println("fault");
		 }

		System.out.println(ds51.toString());

		Arrays.sort(ds51.getGroupOfStudents());

		System.out.println("\n" + "Sort by surname" + "\n");

		System.out.println(ds51.toString());

		System.out.println("\n" + "All student >= 18 year" + "\n");

		for (Student student : ds51.voenka()) {
			System.out.println(student);
		}

	}

}

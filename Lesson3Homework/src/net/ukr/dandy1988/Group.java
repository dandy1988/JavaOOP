package net.ukr.dandy1988;

import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Iterator;

public class Group implements Voenkom {
	
	private Student [] groupOfStudents = new Student[10];

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public Student[] getGroupOfStudents() {
		return groupOfStudents;
	}

	public void setGroupOfStudents(Student[] groupOfStudents) {
		this.groupOfStudents = groupOfStudents;
	}

	public int addStudentInteractive() throws InputMismatchException {
		for(int i = 0; i<groupOfStudents.length; i++) {
		    if (groupOfStudents[i] == null) {
		    	Student student = new Student();
		    	groupOfStudents[i] = student;
		    	Scanner sc = new Scanner(System.in);
		    	System.out.println("Input Name =");
		    	
		    	String name = sc.nextLine();
				groupOfStudents[i].setName(name);
				
		    	System.out.println("Input Surname =");
		    	String surname = sc.nextLine();
				groupOfStudents[i].setSurname(surname);

				try {				
			    	System.out.println("Input year of birth (19XX or 20XX) =");
			    	int dateOfBirth = sc.nextInt();
					groupOfStudents[i].setDateOfBirth(dateOfBirth);
					sc.nextLine();
				} catch (InputMismatchException e) {
					System.out.println("Illegal input of date ");
				}
				
		    	System.out.println("Input Sex =");
		    	String sex = sc.nextLine();
		    	groupOfStudents[i].setSex(sex);
		    	
		    	System.out.println("Input Group =");
		    	String group = sc.nextLine();
				groupOfStudents[i].setGroup(group);
				
				sc.close();
				return 1;
			}			
		}
		return 0;
	}
	
	public void addStudent(String name, String surname, int dateOfBirth, String sex, String group) {
		int i = 0;
		for(i = 0; i<groupOfStudents.length; i++) {
		    if (groupOfStudents[i] == null) {
		    	Student student = new Student();
		    	groupOfStudents[i] = student;
				groupOfStudents[i].setName(name);
				groupOfStudents[i].setSurname(surname);
				groupOfStudents[i].setDateOfBirth(dateOfBirth);
				groupOfStudents[i].setSex(sex);
				groupOfStudents[i].setGroup(group);
//				System.out.println("Student have added");
				break;
			}			
		   }

		try {
			if (i == groupOfStudents.length) {
				throw new OverNumberOfStudents();
			}
		}
		catch(OverNumberOfStudents e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void deleteStudent(String st) {
		int k = 0;
		for(int i = 0; i<groupOfStudents.length; i++) {
		    if ((groupOfStudents[i] != null)&&(groupOfStudents[i].getSurname().equals(st) == true)) {
		    	groupOfStudents[i] = null;
				System.out.println("Student " + st+" have deleted");
				k = 1;
				break;
			}			
		   }
		if (k==0) {
			System.out.println("Student apsent in this group");
		}
		
	}

	public Student findStudent(String surname) {
		int k = 0;
    	Student student = new Student();
		for(int i = 0; i<groupOfStudents.length; i++) {
		    if ((groupOfStudents[i] != null)&&(groupOfStudents[i].getSurname().equals(surname) == true)) {	    	
		    	student = groupOfStudents[i];		    	
				k = 1;
				break;
			}			
		   }
		if (k==0) {
			System.out.println("Student apsent in this group");
			return null;
		}
		return student;
		
	}

	
	@Override
	public String toString() {
		
		for (Student student : groupOfStudents) {
			System.out.println(student);
		}
		return "";
	}

	@Override
	public Student[] voenka() {
		int k = 0;
		for (int i = 0; i < groupOfStudents.length; i++) {
			if ((groupOfStudents[i]!=null)&&(groupOfStudents[i].getDateOfBirth()) >= 18) {
				k++;
			}
		}
		Student [] result = new Student [k];
		k = 0;
		for (int i = 0; i < groupOfStudents.length; i++) {
			if ((groupOfStudents[i]!=null)&&(groupOfStudents[i].getDateOfBirth()) >= 18) {
				result[k] = groupOfStudents[i];
				k++;
			}
		}
		return result;
	}
	
}

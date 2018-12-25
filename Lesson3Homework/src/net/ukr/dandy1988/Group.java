package net.ukr.dandy1988;

import java.util.Arrays;

public class Group {

	private Student [] groupOfStudents = new Student[10];
	

	
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
	
	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Group [groupOfStudents=" + Arrays.toString(groupOfStudents) + "]";
	}
	
}

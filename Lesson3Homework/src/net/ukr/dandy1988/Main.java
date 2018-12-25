package net.ukr.dandy1988;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group ds51 = new Group();
		
//		System.out.println(ds51.toString());

		for (int k = 0; k<10; k++) {
			ds51.addStudent("Ivan"+k, "Ivanov"+k, 1995, "male", "");
		}
		
		ds51.addStudent("Ivan", "Ivanov", 1995, "male", "first");
		
		ds51.deleteStudent("Ivanov1");
		
		ds51.deleteStudent("Danilov");
		
		System.out.println(ds51.findStudent("Ivanov2"));
		
		System.out.println(ds51.toString());
		
	}

}

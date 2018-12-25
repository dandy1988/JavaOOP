package net.ukr.dandy1988;

public class Human {
	private String name;
	private String surname;
	private int dateOfBirth;
	private String sex;

	public Human() {
		super();
//		name = "";
//		surname = "";
//		dateOfBirth = 1970;
//		sex = "";
		// TODO Auto-generated constructor stub
	}
		
	public Human(String name, String surname, int dateOfBirth, String sex) {
		super();
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", surname=" + surname + ", dateOfBirth=" + dateOfBirth + ", sex=" + sex ;
	}
	
	
}

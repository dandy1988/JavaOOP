package net.ukr.dandy1988;

public class Student extends Human{

	private String group;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String group) {
		super();
		this.group = group;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + ", group=" + group + "]");
	}

	
	
}

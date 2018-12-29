package net.ukr.dandy1988;

public class Student extends Human implements Comparable {

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

	@Override
	public int compareTo(Object o) {
		Student st = (Student) o;

		if (o == null) {
			return 1;
		}

		if (this.getName().compareTo(st.getName()) > 0) {
			return 1;
		}
		if (this.getName().compareTo(st.getName()) < 0) {
			return -1;
		}
		return 0;
	}

}

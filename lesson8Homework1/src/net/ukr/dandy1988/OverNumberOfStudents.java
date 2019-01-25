package net.ukr.dandy1988;

public class OverNumberOfStudents extends Exception {

	@Override
	public String getMessage() {
		return "Number of students exceeds";
	}

}

package net.ukr.dandy1988;

public class Element {

	private int a;
	private String b;
	
	public Element() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Element(int a, String b) {
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Element [a=" + a + ", b=" + b + "]";
	}
	
}

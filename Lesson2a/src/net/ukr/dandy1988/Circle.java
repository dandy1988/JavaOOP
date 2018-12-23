package net.ukr.dandy1988;

public class Circle extends Shape {

	private Point a = new Point();
	private Point b = new Point();

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Circle [a=" + a + ", b=" + b + "]";
	}

	@Override
	double getPerimetr() {
		return (2 * Math.PI * lengthOfLine(a, b));
	}

	@Override
	double getArea() {
		return (2 * Math.PI * Math.pow(lengthOfLine(a, b), 2));
	}

	private static double lengthOfLine(Point a, Point b) {
		return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
	}
}

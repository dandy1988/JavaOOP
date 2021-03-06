package net.ukr.dandy1988;

public class Box extends Shape {

	private Point a = new Point();
	private Point b = new Point();
	private Point c = new Point();
	private Point d = new Point();

	public Box() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Box(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
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

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Box [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

	@Override
	double getPerimetr() {
		return (2 * lengthOfLine(a, b) + 2 * lengthOfLine(b, c));
	}

	@Override
	double getArea() {
		return lengthOfLine(a, b) * lengthOfLine(b, c);
	}

	private static double lengthOfLine(Point a, Point b) {
		return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
	}

}

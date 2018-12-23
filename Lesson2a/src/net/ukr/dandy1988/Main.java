package net.ukr.dandy1988;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point point1 = new Point(4, 5);
		Point point2 = new Point(10, 5);
		Point point3 = new Point(10, 10);
		Point point4 = new Point(4, 10);
		Point point5 = new Point(10, 11);
		Point point6 = new Point(4, 11);

		Box b1 = new Box(point1, point2, point3, point4);

		Circle c1 = new Circle(point1, point2);

		Quad q1 = new Quad(point1, point2, point5, point6);

		System.out.println("Area of Box =" + b1.getArea());
		System.out.println("Perimetr of Box =" + b1.getPerimetr());

		System.out.println("Area of Circle =" + c1.getArea());
		System.out.println("Perimetr of Circle =" + c1.getPerimetr());

		System.out.println("Area of Quad =" + q1.getArea());
		System.out.println("Perimetr of Quad =" + q1.getPerimetr());

	}

	public static double lehgthOfLine(Point a, Point b) {
		return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
	}

}

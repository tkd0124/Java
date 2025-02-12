package kadai9.shape;

import java.util.Scanner;

public class Circle extends Shape {

	private double radius;

	public Circle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("円の面積を求めます。");
		System.out.print("半径:");
		this.radius = scanner.nextDouble();
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calcArea() {
		super.setArea(Math.PI * radius * radius);
	}

	@Override
	public void calcPerimeter() {
		super.setPerimeter(2 * radius * Math.PI );
	}
}

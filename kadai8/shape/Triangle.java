package kadai8.shape;

import java.util.Scanner;

public class Triangle extends Shape {

	private double base;
	private double height;

	public Triangle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("三角形の面積を求めます。");
		System.out.print("底辺:");
		this.base = scanner.nextDouble();
		System.out.print("高さ:");
		this.height = scanner.nextDouble();
	}

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void calcArea(){
		super.setArea(base * height / 2);
	}
}

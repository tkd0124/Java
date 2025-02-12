package kadai9.shape;

import java.util.Scanner;

public class Rectangle extends Shape {

	private double width;
	private double height;

	public Rectangle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("四角形の面積を求めます。");
		System.out.print("幅　:");
		this.width = scanner.nextDouble();
		System.out.print("高さ:");
		this.height = scanner.nextDouble();
	}


	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void calcArea(){
		super.setArea(width * height);
	}

	@Override
	public void calcPerimeter() {
		super.setPerimeter(2 * (width + height));
	}


}

package kadai9.shape;

public abstract class Shape {

	private double area;
	private double perimeter;

	public Shape() {}

	public  void  setArea(double area) {
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public abstract void calcArea();

	public abstract void calcPerimeter();
}

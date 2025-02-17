package k9.shape;

public abstract class Shape {
    private double area;
    private double perimeter;

    public void setArea(double area) {
        this.area = area;
    }
    public void setPerimeter(double perimeter){
        this.perimeter = perimeter;
    }
    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }


    public abstract void calcArea();
    public abstract void calcPerimeter();
}

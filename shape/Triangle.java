package k9.shape;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle extends Shape {
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(Scanner scanner){
        System.out.println("三角形の面積を求めます。");
        while (true){
            try{
                System.out.print("底辺：");
                if (!scanner.hasNextDouble()){
                    throw new InputMismatchException();
                }
                double number = scanner.nextDouble();
                System.out.print("高さ：");
                if (!scanner.hasNextDouble()){
                    throw new InputMismatchException();
                }
                double number2 = scanner.nextDouble();

                if (number <= 0 || number2 <= 0){
                    System.out.println("正の数値を入力してください。");
                }else {
                    this.base = number;
                    this.height = number2;
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("数値を入力してください。");
                scanner.next();
            }
        }
    }

    public void calcArea(){
        setArea(this.base * this.height / 2);
    }
    @Override
    public void calcPerimeter(){
        setPerimeter(this.base + this.height + Math.sqrt(this.base * this.base + this.height * this.height));
    }
}

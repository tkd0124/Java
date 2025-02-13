package shape;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {
    private double area;
    private double width;
    private double height;

    public double getArea(){
        return this.area;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setArea(double area){
        this.area = area;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(Scanner scanner){
        System.out.println("四角形の面積を求めます。");

        while (true){
            try{
                System.out.print("幅：");
                if (!scanner.hasNextDouble()){
                    throw new InputMismatchException();
                }
                double input = scanner.nextDouble();

                System.out.print("高さ：");
                if (!scanner.hasNextDouble()){
                    throw new InputMismatchException();
                }
                double input2 = scanner.nextDouble();

                if (input <= 0 || input2 <= 0){
                    System.out.println("正の数値を入力してください。");
                }else {
                    this.width = input;
                    this.height = input2;
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("数値を入力してください。");
                scanner.next();
            }
        }
    }

    public void calcArea(){
        this.area = this.height * this.width;
    }
}

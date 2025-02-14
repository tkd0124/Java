package shape;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle extends Shape {

    private double radius;

    public double getRadius(){
        return  this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public Circle(Scanner scanner){
        super();
        System.out.println("円の面積を求めます。");

        while (true) {
            try{

                System.out.print("半径：");
                if (!scanner.hasNextDouble()){
                    throw new InputMismatchException();
                }
                double input = scanner.nextDouble();

                if (input <= 0){
                    System.out.println("半径は正の数値を入力してください。");
                }else {
                    this.radius = input;
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("数値を入力してください。");
                scanner.next();
            }
        }
    }

    public void calcArea(){
        setArea(this.radius * this.radius * Math.PI);
    }

}

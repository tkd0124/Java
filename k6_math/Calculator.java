package k6_math;

public class Calculator {
    int a;
    int b;

    public Calculator(){
        this.a = 0 ;
        this.b = 0 ;
    }

    public int tasu(int num, int num2){
        return num + num2 ;
    }
    public int hiku(int num, int num2){
        return num - num2;
    }
    int kakeru(int num, int num2){
        return num * num2;
    }
    int waru(int num, int num2){
        return num / num2;
    }
}

package src;

public class K4_3 {
    public static void main(String[] args) {

        System.out.println("計算を行います。");

        calc(10, 20, '+');
        calc(10, 10.5, '-');
        calc(10, 0, '*');
        calc(10, 10.0, '/');

    }
    public static void calc(double num, double num2, char e){

        double p = num + num2;
        System.out.println(num + e + num2 + "=" + p);

    }
}

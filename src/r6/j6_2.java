package j6;

public class j6_2 {
    public static int tasu(int a, int b) {
        return (a + b);
    }
    public static int hiku(int a, int b) {
        return (a - b);
    }
    public static void main(String[] args){
        int a= 10;
        int b= 11;
        int t = tasu(a, b);
        int h = hiku(a, b);
        System.out.println(t + ":" + h);
    }
}

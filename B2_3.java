public class B2_3 {
    public static void main(String[] args) {
        int a = 10;
        int c = 0;
        String binary = "";
        for (; a != 0; a /= 2){
            int reminder = a % 2;
            binary = reminder + binary;
            //a = a / 2;
            //c += 1;
        }
        System.out.println(binary);
    }
}

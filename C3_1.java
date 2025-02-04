public class C3_1 {
    public static void main(String[] args) {
        int a = 16;
        //int b = 0;
        String binary = "";

        while (a != 0){
            int remainder = a % 2;
            a /= 2;
            //a = a / 2;
        /*文字列型にint型を入れる発想がなかった
        1010になるように空のsにb + s の順に入れれば1010になるということが発想になかった
        b=a%2で計算した値が右から古い順に並べることができれば良いという発想がなかった 　
        文字列とintの連結
        Javaでは、文字列とintを「+」演算子で連結すると、intは自動的に文字列に変換されます。
        つまり、b + s と書くことで、bが数値であっても、文字列としてsの前に追加されるのです。
        */
            binary = remainder + binary;
        }
        System.out.println(binary);
    }
}
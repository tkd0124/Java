package k6_math;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bf {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("名前：");
            String input = br.readLine();
            System.out.print("住所：");
            String input2 = br.readLine();

            System.out.println("あなたの名前は" + input + "です。");
            System.out.println(input2 + "に住んでいます。");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

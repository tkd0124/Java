package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class k4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Card> cards = new ArrayList();

        String[] marks = {" ♥ "," ♦ "," ♠ "," ♣ "};

        for (String mark : marks){

            for (int j = 0; j <= 13; j++){
                cards.add(new Card(j,mark));
            }
        }
        System.out.println("カードを生成しました");

        int count = 1;
        while (true){
            System.out.println(count + "回目");

            System.out.println("カードをシャッフルしました。");

            Collections.shuffle(cards);

            List<Card> hand = new ArrayList<>();

            for (int i = 0; i < 5; i++){
                hand.add(cards.get(i));
            }

            System.out.println("手札をソートしました。");
            Collections.sort(hand);
            System.out.println();


            System.out.print("手札：");

            for (Card card: hand){
                System.out.print(card.getMark() + card.getNumber() + " ");
            }
            System.out.println();



//            System.out.print("もう一度（y/n）: ");
//            String str = scanner.next();
//            System.out.println();

//            if (str.equals("n")) {
//                System.out.println("End");
//                break;
//            }
//            hand.clear();
            count++;

        }
    }
}

package Collection;

import java.util.ArrayList;
import java.util.List;

public class k2 {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        String[] marks = {"ハート","ダイヤ","スペード","クラブ"};

        for (String mark : marks){
            for (int j = 0; j <= 13; j++){
                cards.add(new Card(j,mark));
//                K2Card card = new K2Card(j, mark);
//                cards.add(card);
            }
        }
        System.out.println("カードを生成しました");
        for (Card card: cards){
            System.out.println(card);;
        }
        for (Card card : cards){
            System.out.println(card.getMark() + card.getNumber());
        }
//        for (int i = 0; i < cards.size(); i++) {
//            cards.get(i);
//        }

//        for (int i = 1; i <= 13; i++) {
//            K2Card cardi = new K2Card(i, "ハート");
//            cards.add(cardi);
//        }
//        for (int i = 1; i <= 13; i++) {
//            K2Card cardi = new K2Card(i, "ダイヤ");
//            cards.add(cardi);
//        }
//        for (int i = 1; i <= 13; i++) {
//            K2Card cardi = new K2Card(i, "スペード");
//            cards.add(cardi);
//        }
//        for (int i = 1; i <= 13; i++) {
//            K2Card cardi = new K2Card(i, "クラブ");
//            cards.add(cardi);
//        }
//        System.out.println("カードを生成しました");
//        for (int i = 0; i < cards.size(); i++) {
//            cards.get(i).OneCards();
//        }
//        cards.add()
    }
}

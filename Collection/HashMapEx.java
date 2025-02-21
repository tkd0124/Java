package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {

        Map<String, Double> hashMap = new HashMap<>();

        hashMap.put("東京都", 45.25);
        hashMap.put("大阪府", 47.10);
        hashMap.put("京都", 51.25);
        hashMap.put("沖縄", 43.46);

        System.out.println("東京都の平均年齢は" + hashMap.get("東京都"));
        System.out.println();

        for (String key: hashMap.keySet()){
            System.out.println(key + "の平均年齢は" + hashMap.get(key));



        }
        System.out.println();
        for (Map.Entry<String, Double> entry: hashMap.entrySet()){
            System.out.println(entry.getKey() + "の平均年齢は" + entry.getValue());



        }
    }
}

package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExampleIBU {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        System.out.println(map.keySet());
        for (String key : map.keySet()){
            System.out.println("キー: " + key + "-> ハッシュ値: " + key.hashCode());
        }


        System.out.println(map.keySet());

        for (String key : map.keySet()){
            System.out.println("キー: " + key + "-> ハッシュ値: " + key.hashCode());
        }
    }
}

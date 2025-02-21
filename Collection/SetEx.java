package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<Integer>(        );

        hashSet.add(1990);
        hashSet.add(2000);
        hashSet.add(1992);
        hashSet.add(1990);

        System.out.println(hashSet);
        System.out.println();

        for (Integer i: hashSet){
            System.out.println(i);
        }
        System.out.println();

        if (hashSet.contains(1990)){
            System.out.println("1900は含まれている");
        }else{
            System.out.println("1900は含まれていない");
        }
        System.out.println(        );

        System.out.println(hashSet.contains(1990));
        System.out.println(hashSet.contains(1));

        System.out.println(hashSet.size());

        hashSet.remove(1990);
        System.out.println(hashSet.contains(1990));
    }
}

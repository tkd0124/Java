package j13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AAA", "VVV", "XXX");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted names : " + names);
    }
}

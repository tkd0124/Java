package Collection;

import java.util.*;

public class ListPerformanceComparison {
    public static void main(String[] args) {
        int size = 100000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // データを追加
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // 追加・削除する位置が既に分かっている場合 (Iterator を使用)
        System.out.println("\n--- LinkedList: 既に位置が分かっている場合 ---");
        long start = System.nanoTime();
        ListIterator<Integer> iterator = ((LinkedList<Integer>) linkedList).listIterator(size / 2);
        iterator.next();
        iterator.remove(); // 削除
        iterator.add(99999); // 追加
        long end = System.nanoTime();
        System.out.println("LinkedList (位置が既に分かっている) の処理時間: " + (end - start) / 1000000.0 + " ms");

        // 探しながら削除・追加する場合
        System.out.println("\n--- LinkedList: 探しながら削除・追加する場合 ---");
        start = System.nanoTime();
        linkedList.remove(size / 2); // 途中の要素を削除 (O(n))
        linkedList.add(size / 2, 99999); // 途中に追加 (O(n))
        end = System.nanoTime();
        System.out.println("LinkedList (探しながら削除・追加) の処理時間: " + (end - start) / 1000000.0 + " ms");

        // ArrayList で同じ操作を実施
        System.out.println("\n--- ArrayList: 途中の削除・追加 ---");
        start = System.nanoTime();
        arrayList.remove(size / 2); // 途中の要素を削除 (O(n))
        arrayList.add(size / 2, 99999); // 途中に追加 (O(n))
        end = System.nanoTime();
        System.out.println("ArrayList (途中の削除・追加) の処理時間: " + (end - start) / 1000000.0 + " ms");
    }
}

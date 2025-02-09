package src.r5;

import java.util.Arrays;

public class j5_13 {
    // int型配列を受け取り、
    // 配列内の要素すべてに1を加えるメソッド
    public static void incArray(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        incArray(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

}

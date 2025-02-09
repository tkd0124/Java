package src.r5;

import java.util.Arrays;

public class j5_14 {
    public static int[] makeArray(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++ ) {
            newArray[i] = i;
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
    public static void main(String[] args) {
        int[] array = makeArray(3);
        for (int i : array) {
            System.out.println(i);
        }
    }
}

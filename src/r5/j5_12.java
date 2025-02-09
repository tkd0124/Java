package src.r5;

public class j5_12 {
    // int型配列を受け取り、すべての要素を表示するメソッド
    public static void printArray(int[] warray) {
        for (int element : warray) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        printArray(array);    // 配列を渡す
    }
}

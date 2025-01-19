 package r4;

// public class r4_19 {
//     public static void main(String[] args) {
//         int[][] scores = {{40, 50, 60}, {80, 60, 70}};
//         System.out.println(scores.length);
//         System.out.println(scores[0].length);
//       }
    
// }
public class r4_19 {
    public static void main(String[] args) {
        int[][] scores = {{40, 50, 60}, {80, 60, 70}};
        System.out.println("行数: " + scores.length); // 行数
        System.out.println("1行目の列数: " + scores[0].length); // 1行目の列数
        System.out.println("2行目の列数: " + scores[1].length); // 2行目の列数

        // 配列の中身を出力
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
    }
}

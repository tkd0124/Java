package src;

import java.util.Arrays;
import java.util.Random;

public class k3_4 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomArray = random.nextInt(10);
        int[] array = new int[randomArray];
        System.out.println("要素数：" + array.length);

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
        System.out.println("生成した配列：" + Arrays.toString(array));
//        int[] array = {98, 80, 60, 79, 30};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < (array.length -1 - i); j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println("ソート後配列：" + Arrays.toString(array));
        double ave = 0;
        double sum = 0;
        double center = 0;

        for (int i : array){
            sum += i;
        }
        ave = sum / array.length;

        if (0 == (array.length % 2)){
            center = (double) (array[array.length/2 - 1] + array[(array.length/2)]) / 2;
        }else {
            center = (double) (array[array.length/2]);
        }



        System.out.println("平均値：" + ave);
        System.out.println("中央値：" + center);

    }
}

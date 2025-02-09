package src;

import java.util.Scanner;

public class K4_2 {
    public static void main(String[] args) {

        String[] users = new String[5];

        entry(users);//配列を渡す
        int userCount = countUser(users);

        System.out.println("登録されたユーザーは" + userCount +
                "人です");
        System.out.println("ユーザー一覧");
        for (String user : users){
            if (user == null){
                continue;
            }
            System.out.println(user);
        }
    }
    public static void entry(String[] array){
        System.out.println("最大５人までのユーザーを登録できます。");
//        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            System.out.print("ユーザ名：");
            String name = scanner.nextLine();
            if (name.equals("exit")){
                break;
            }else {
                array[i] = name;
            }
        }
        System.out.println("登録を終了します。");

    }
    public static int countUser(String[] reArray){
        int count = 0;
        for(String str: reArray){
            if(str == null){
                continue;
            }
            count++;
        }
        return count;
    }
}

package Exeption;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWiterMain2{
    public static void main(String[] args) {
        try(
                FileWriter fw = new FileWriter("src\\text.txt, true");
                BufferedWriter bw = new BufferedWriter(fw);
                ){
            System.out.println("ファイルに書き込みます");
            System.out.println("文字列を入力してください(終了する場合は0を入力)");
            Scanner scanner = new Scanner(System.in);

            for (int i = 1; ;i++){
                System.out.print(i + "行目");
                String str = scanner.nextLine();

                if (str.equals("0")){
                    break;
                }else {
                    bw.write(str);
                    bw.newLine();
                }
            }
            System.out.println("ファイルの書き込みが終わりました");
        }catch (FileNotFoundException e){
            System.out.println("ファイルが見つかりませんでした");
            System.out.println("例外メッセージ" + e.getMessage());
        }catch (IOException e){
            System.out.println("ファイルの読み込みに失敗しました");
            e.printStackTrace(System.out);
        }
        System.out.println("End of program");
    }
}

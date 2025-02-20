package Exeption;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterMain {
    public static void main(String[] args) {

        FileWriter fr = null;
        BufferedWriter bw = null;

        try{
            fr = new FileWriter("src\\text.txt");
            bw = new BufferedWriter(fr);

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
        }finally {
            System.out.println("Finally処理のブロック");
            try {
                if (bw != null){
                    bw.close();
                }
                if (fr != null){
                    fr.close();
                }
            }catch (IOException e){
                e.printStackTrace(System.out);
            }
        }
        System.out.println("End of program");

    }
}

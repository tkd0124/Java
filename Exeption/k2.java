package Exeption;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class k2 {
    public static void main(String[] args) {

        try (
                FileWriter fw = new FileWriter("src\\log.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter fa = DateTimeFormatter.ofPattern("yyyy年MM付dd日HH時mm分ss秒", Locale.JAPANESE);
            String str = now.format(fa) + "：Kadai11_2.javaが実行されました";

            bw.write(str);
            bw.newLine();
            System.out.println("logファイルへの書込みが完了しました。");
     //   }//catch (FileNotFoundException e){
        // System.out.println("ファイルが見つかりませんでした");
        //System.out.println("例外メッセージ" + e.getMessage());
        }catch (IOException e){
            System.out.println("ファイルの読み込みに失敗しました");
            e.printStackTrace(System.out);
        }

    }
}

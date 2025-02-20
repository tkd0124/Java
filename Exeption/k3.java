package Exeption;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class k3 {
    public static void main(String[] args) {

        try (
                FileWriter fw = new FileWriter("src\\k3.csv");
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            for (int i = 1; i < 10; i++){
                for (int j = 1; j < 10; j++){
                    bw.write((i * j) + ",");
                }
                bw.newLine();
            }

            System.out.println("「k3.csv」への書込みが完了しました。");
            //   }//catch (FileNotFoundException e){
            // System.out.println("ファイルが見つかりませんでした");
            //System.out.println("例外メッセージ" + e.getMessage());
        }catch (IOException e){
            System.out.println("ファイルの読み込みに失敗しました");
            e.printStackTrace(System.out);
        }

    }
}

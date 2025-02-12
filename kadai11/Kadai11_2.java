package kadai11;

import javax.swing.text.DateFormatter;
import java.io.*;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Kadai11_2 {

	public static void main(String[] args) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
		Date now = new Date();

		try(
				FileWriter fr = new FileWriter("src\\log.txt", true);
		        BufferedWriter bw = new BufferedWriter(fr);
		){

			bw.write(simpleDateFormat.format(now) + ": Kadai11_2.javaが実行されました。");
			bw.newLine();

			System.out.println("logファイルへの書込みが完了しました。");

		}catch (IOException e) {
			System.out.println("ファイルの読み込みに失敗しました");
			e.printStackTrace(System.out);

		}
	}
}

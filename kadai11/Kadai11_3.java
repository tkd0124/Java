package kadai11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Kadai11_3 {
	public static void main(String[] args) {

		try(
				FileWriter fr = new FileWriter("src\\kadai11_3.csv", false);
				BufferedWriter bw = new BufferedWriter(fr);
		){

			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					bw.write(i * j + ",");
				}
				bw.newLine();
			}

			System.out.println("「kadai11_3.csv」への書込みが完了しました。");

		}catch (IOException e) {
			System.out.println("ファイルの読み込みに失敗しました");
			e.printStackTrace(System.out);
		}
	}
}
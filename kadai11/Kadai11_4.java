package kadai11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Kadai11_4 {

	public static void main(String[] args) {

		try(
				FileReader fr = new FileReader("src\\kadai11_4.csv");
				BufferedReader br = new BufferedReader(fr);

		){

			while (br.ready()) {

				String[] str = br.readLine().split(",");

				System.out.println("名前:" + str[0] + "  年齢:" + str[1] + "  性別:" + str[2] + "  職業:" + str[3]);
			}


		}catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした");
			System.out.println("例外メッセージ: " + e.getMessage());

		}catch (IOException e) {
			System.out.println("ファイルの読み込みに失敗しました");
			e.printStackTrace(System.out);
		}
	}
}

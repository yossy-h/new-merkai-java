// 前回の気分を表示

import java.io.*;
import java.util.Scanner;

class LastTime1 {

	//--- 前回の気分を読み込む---//
	static void init() {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("LastTime.txt"));
			String kibun = br.readLine();
			System.out.println("前回の気分は" + kibun + "でした。");
		} catch (IOException e){
			System.out.println("このプログラムを実行するのは初めてですね。");
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e){
					System.out.println("ファイルクローズ失敗。");
				}
			}
		}
	}

	//--- 今回の気分を読み込む---//
	static void term(String kibun) {
		FileWriter fw = null;

		try {
			fw = new FileWriter("LastTime.txt");
			fw.write(kibun);
		} catch (IOException e){
			System.out.println("エラー発生!!");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e){
					System.out.println("ファイルクローズ失敗。");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		init();				// 前回の気分を表示

		System.out.print("今の気分は：");
		String kibun = stdIn.next();

		term(kibun);
	}
}

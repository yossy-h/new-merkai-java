// 点数を読み込んで合計点・平均点を表示

import java.util.Scanner;

class PointSumAve {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int sum = 0;		// 合計
		System.out.println("5人の点数を入力せよ。");

		System.out.print("1番の点数：");
		int yamane = stdIn.nextInt();
		sum += yamane;

		System.out.print("2番の点数：");
		int takada = stdIn.nextInt();
		sum += takada;

		System.out.print("3番の点数：");
		int kawachi = stdIn.nextInt();
		sum += kawachi;

		System.out.print("4番の点数：");
		int koga = stdIn.nextInt();
		sum += koga;

		System.out.print("5番の点数：");
		int tozuka = stdIn.nextInt();
		sum += tozuka;

		System.out.println("合計は" + sum + "点です。");
		System.out.println("平均は" + (double)sum / 5 + "点です。");
	}
}

import java.util.Random;

import java.util.Scanner;

class Abc {

	public static void main(String[] args) {

		Random rand = new Random();

		Scanner stdIn = new Scanner(System.in);

		int a;		// aはint型の変数
		a = 2;		// 代入（生成ずみの変数に値を入れる）
		int b = -1;	// 初期化（変数の生成時に値を入れる）

		double x = 1.5 * 2;


		// 値を書きかえられない変数（定数に名前を与える）
		final double PI = 3.14;
		x = rand.nextDouble();
		System.out.println(
			"半径" + x + "の円の面積は" +
			(PI * x * x) + "です。");
		System.out.print("整数aの値：");
		a = stdIn.nextInt();
		System.out.println("a / 2 = " + a / 2);
		System.out.println("a % 2 = " + a % 2);
		// 文字列型
		String s = "ABC";
		System.out.println("文字列sは" + s + "です。");
	}
} 
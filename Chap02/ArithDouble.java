// 二つの実数値を読み込んで加減乗除した値を表示

import java.util.Scanner;

class ArithDouble {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("xとyを加減乗除します。");

		System.out.print("xの値：");		// xの値の入力を促す
		double x = stdIn.nextDouble();	// xに実数値を読み込む

		System.out.print("yの値：");		// yの値の入力を促す
		double y = stdIn.nextDouble();	// yに実数値を読み込む

		System.out.println("x + y = " + (x + y));	 // x + yの値を表示
		System.out.println("x - y = " + (x - y));	 // x - yの値を表示
		System.out.println("x * y = " + (x * y));	 // x * yの値を表示
		System.out.println("x / y = " + (x / y));	 // x / yの値を表示（商）
		System.out.println("x % y = " + (x % y));	 // x % yの値を表示（剰余）
	}
}

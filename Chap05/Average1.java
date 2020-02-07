// 二つの整数値の平均値を実数で求める（間違い）

import java.util.Scanner;

class Average1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数値xとyの平均値を求めます。");
		System.out.print("xの値：");  int x = stdIn.nextInt();
		System.out.print("yの値：");  int y = stdIn.nextInt();

		double ave = (x + y) / 2;											// 平均値
		System.out.println("xとyの平均値は" + ave + "です。");	// 表示
	}
}

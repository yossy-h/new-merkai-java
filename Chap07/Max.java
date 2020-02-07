// 二値の最大値・三値の最大値を求めるメソッド（多重定義）

import java.util.Scanner;

class Max {

	//--- a, bの最大値を返却 ---//
	static int max(int a, int b) {
		return a > b ? a : b;
	}

	//--- a, b, cの最大値を返却 ---//
	static int max(int a, int b, int c) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("xの値：");  int x = stdIn.nextInt();
		System.out.print("yの値：");  int y = stdIn.nextInt();
		System.out.print("zの値：");  int z = stdIn.nextInt();

		// 二値の最大値
		System.out.println("x, yの最大値は" + max(x, y) + "です。");

		// 三値の最大値
		System.out.println("x, y, zの最大値は" + max(x, y, z) + "です。");
	}
}

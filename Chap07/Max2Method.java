// 三つの整数値の最大値を求める（メソッド版）

import java.util.Scanner;

class Max2Method {

	//--- a, bの最大値を返却 ---//
	static int max2(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");  int a = stdIn.nextInt();
		System.out.print("整数b：");  int b = stdIn.nextInt();

		System.out.println("最大値は" + max2(a, b) + "です。");
	}
}

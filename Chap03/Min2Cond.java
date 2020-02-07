// 読み込んだ二つの整数値の小さいほうの値を表示（その２：条件演算子）

import java.util.Scanner;

class Min2Cond {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");  int a = stdIn.nextInt();
		System.out.print("整数b：");  int b = stdIn.nextInt();

		int min = a < b ? a : b;		// 小さいほうの値
		System.out.println("小さいほうの値は" + min + "です。");
	}
}

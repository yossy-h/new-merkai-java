// べき乗を求める

import java.util.Scanner;

class Power {

	//--- xのn乗を返す ---//
	static double power(double x, int n) {
		double tmp = 1.0;

		for (int i = 1; i <= n; i++)
			tmp *= x;	// tmpにxを掛ける
		return tmp;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("aのb乗を求めます。");
		System.out.print("実数a：");  double a = stdIn.nextDouble();
		System.out.print("整数b：");  int b = stdIn.nextInt();

		System.out.println(a + "の" + b + "乗は" + power(a, b) + "です。");
	}
}

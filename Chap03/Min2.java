// 読み込んだ二つの整数値の小さいほうの値を表示（その１：if文）

import java.util.Scanner;

class Min2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");  int a = stdIn.nextInt();
		System.out.print("整数b：");  int b = stdIn.nextInt();

		int min;		// 小さいほうの値
		if (a < b)
			min = a;
		else
			min = b;

		System.out.println("小さいほうの値は" + min + "です。");
	}
}

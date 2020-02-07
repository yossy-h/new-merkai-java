// 読み込んだ二つの整数値は等しいか

import java.util.Scanner;

class Equal {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");  int a = stdIn.nextInt();
		System.out.print("整数b：");  int b = stdIn.nextInt();

		if (a == b)
			System.out.println("二つの値は等しいです。");
		else
			System.out.println("二つの値は等しくありません。");
	}
}

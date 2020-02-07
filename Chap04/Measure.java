// 読み込んだ整数値のすべての約数を表示

import java.util.Scanner;

class Measure {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();

		for (int i = 1; i < n; i++)
			if (n % i == 0)				// 割り切れたら
				System.out.println(i);	// 表示
	}
}

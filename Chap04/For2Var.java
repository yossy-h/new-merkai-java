// 読み込んだ整数値と1, 2, …との差を表示

import java.util.Scanner;

class For2Var {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();

		for (int i = 1, j = n - 1; i <= n; i++, j--)
			System.out.println(i + " " + j);
	}
}

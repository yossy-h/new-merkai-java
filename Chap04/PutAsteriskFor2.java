// 読み込んだ個数だけ*を表示

import java.util.Scanner;

class PutAsteriskFor2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何個*を表示しますか：");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++)
			System.out.print('*');
		System.out.println();
	}
}

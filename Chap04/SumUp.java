// 1からnまでの和を求める

import java.util.Scanner;

class SumUp {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1からnまでの和を求めます。");
		int n;
		do {
			System.out.print("nの値：");
			n = stdIn.nextInt();
		} while (n <= 0);

		int sum = 0;				// 合計
		int i = 1;

		while (i <= n) {
			sum += i;				// sumにiを加える
			i++;						// iをインクリメント
		}
		System.out.println("1から" + n + "までの和は" + sum + "です。");
	}
}

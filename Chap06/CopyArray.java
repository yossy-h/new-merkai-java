// 配列の全要素をコピーして表示

import java.util.Scanner;

class CopyArray {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int n = stdIn.nextInt();		// 要素数を読み込む
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {	// 配列aに値を読み込む
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}

		for (int i = 0; i < n; i++)		// 配列aの全要素を配列bにコピー
			b[i] = a[i];

		System.out.println("aの全要素をbにコピーしました。 ");

		for (int i = 0; i < n; i++)		// 配列bを表示
			System.out.println("b[" + i + "] = " + b[i]);
	}
}

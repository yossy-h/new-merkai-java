// 配列の全要素に値を読み込んで表示

import java.util.Scanner;

class IntArrayScan {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int n = stdIn.nextInt();			// 要素数を読み込む
		int[] a = new int[n];				// 配列を生成

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}

		for (int i = 0; i < n; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}

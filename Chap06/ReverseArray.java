// 配列の要素の順序を逆順に並べかえて表示

import java.util.Random;
import java.util.Scanner;

class ReverseArray {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int n = stdIn.nextInt();  // 要素数を読み込む
		int[] a = new int[n];	  // 配列を宣言

		for (int i = 0; i < n; i++) {
			a[i] = 10 + rand.nextInt(90);
			System.out.println("a[" + i + "] = " + a[i]);
		}

		for (int i = 0; i < n / 2; i++) {
			int t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}

		System.out.println("要素の並びを反転しました。");
		for (int i = 0; i < n; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}

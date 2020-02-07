// 二つの変数を昇順（小さい順）にソート

import java.util.Scanner;

class Sort2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("変数a：");
		int a = stdIn.nextInt();

		System.out.print("変数b：");
		int b = stdIn.nextInt();

		if (a > b) {	// aがbより大きければ
			int t = a;	// それらの値を交換
			a = b;
			b = t;
		}

		System.out.println("a≦bとなるようにソートしました。");
		System.out.println("変数aは" + a + "です。");
		System.out.println("変数bは" + b + "です。");
	}
}

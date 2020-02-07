// 負の整数の絶対値を求める（ラベル付きbreak文の利用例）

import java.util.Scanner;

class Absolute {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

	a: {
			System.out.print("負の整数：");
			int t = stdIn.nextInt();
			if (t >= 0) break a;
			t = -t;		
			System.out.println("絶対値は" + t + "です。");
		}
	}
}

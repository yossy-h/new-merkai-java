// 読み込んだ整数のグループを加算（整数5個×10グループ）

import java.util.Scanner;

class SumGroup2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数を加算します。");
		int total = 0;		// 全グループの合計

	Outer:
		for (int i = 1; i <= 10; i++) {
			System.out.println("■第" + i + "グループ");

			for (int j = 0; j < 5; j++) {
				System.out.print("整数：");
				int t = stdIn.nextInt();
				if (t == 99999)
					break Outer;
				else if (t == 88888)
					continue Outer;
				total += t;
			}
		}
		System.out.println("\n合計は" + total + "です。");
	}
}

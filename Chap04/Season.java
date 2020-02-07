// 入力された月の季節を表示

import java.util.Scanner;

class Season {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int retry;			// もう一度？

		do {
			System.out.print("季節を求めます。\n何月ですか：");
			int month = stdIn.nextInt();

			if (month >= 3 && month <= 5)							  // 3月・4月・5月
				System.out.println("それは春です。");
			else if (month >= 6 && month <= 8)					  // 6月・7月・8月
				System.out.println("それは夏です。");
			else if (month >= 9 && month <= 11)					  // 9月・10月・11月
				System.out.println("それは秋です。");
			else if (month == 12 || month == 1 || month == 2) // 12月・1月・2月
				System.out.println("それは冬です。");

			System.out.print("もう一度？ 1…Yes／0…No：");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}

// 二つの整数値を読み込んで加減乗除した値を表示

import java.util.Scanner;
import java.util.InputMismatchException;

class ExceptionSample {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("xとyを加減乗除します。");

		while (true) {
			try {
				System.out.print("xの値：");  int x = stdIn.nextInt();
				System.out.print("yの値：");  int y = stdIn.nextInt();

				System.out.println("x + y = " + (x + y));
				System.out.println("x - y = " + (x - y));
				System.out.println("x * y = " + (x * y));
				System.out.println("x / y = " + (x / y));
				System.out.println("x % y = " + (x % y));
			} catch (InputMismatchException e) {
				System.out.println("入力エラー発生。" + e);
				String s = stdIn.next();
				System.out.println(s + "は無視しました。");
			} catch (ArithmeticException e) {
				System.out.println("算術エラー発生。" + e);
				System.out.println("エラーが出ないような数値をお願いします。");
			} finally {
				System.out.println("--------------------");
				System.out.print("もう一度？（1…Yes／0…No）：");
				int retry = stdIn.nextInt();
				if (retry == 0) break;
				System.out.println("--------------------");
			}
		}
	}
}

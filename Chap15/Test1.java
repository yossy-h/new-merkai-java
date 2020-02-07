// 文字列を扱うプログラム

import java.util.Scanner;

class Test1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("文字列s1：");  String s1 = stdIn.next();
		System.out.print("文字列s2：");  String s2 = stdIn.next();

		for (int i = 0; i < s1.length(); i++)
			System.out.println("s1[" + i + "] = " + s1.charAt(i));

		for (int i = 0; i < s2.length(); i++)
			System.out.println("s2[" + i + "] = " + s2.charAt(i));

		int idx = s1.indexOf(s2);
		if (idx == -1)
			System.out.println("s1中にs2は含まれません。");
		else
			System.out.println("s1の" + (idx + 1) + "文字目にs2が含まれます。");

		if (s1.equals(s2))
			System.out.println("s1とs2の中身は等しい。");
		else
			System.out.println("s1とs2の中身は等しくない。");

		for (int i = 1; i <= 4; i++) {
			System.out.printf(String.format("%%%dd\n", i), 5);
		}

		System.out.println("文字列\"123\"を整数値に変換した結果：" +
															Integer.parseInt("123"));
		System.out.println("文字列\"123.45\"を浮動小数点値に変換した結果：" +
															Double.parseDouble("123.45"));
	}
}

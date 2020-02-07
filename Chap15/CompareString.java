// 文字列の比較

import java.util.Scanner;

class CompareString {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("文字列s1：");  String s1 = stdIn.next();
		System.out.print("文字列s2：");  String s2 = stdIn.next();

		if (s1 == s2)
			System.out.println("s1 == s2 です。");
		else
			System.out.println("s1 != s2 です。");

		if (s1.equals(s2))
			System.out.println("s1とs2の中身は等しい。");
		else
			System.out.println("s1とs2の中身は等しくない。");
	}
}

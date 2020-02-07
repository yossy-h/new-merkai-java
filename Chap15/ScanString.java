// 文字列を１文字ずつ走査して表示

import java.util.Scanner;

class ScanString {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("文字列s：");
		String s = stdIn.next();

		for (int i = 0; i < s.length(); i++)
			System.out.println("s[" + i + "] = " + s.charAt(i));
	}
}
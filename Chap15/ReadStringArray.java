//	文字列の配列（読み込んで表示）

import java.util.Scanner;

class ReadStringArray {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("文字列の個数：");
		int n = stdIn.nextInt();
		String[] sx = new String[n];

		for (int i = 0; i < sx.length; i++) {
			System.out.print("sx[" + i + "] = ");
			sx[i] = stdIn.next();
		}
		for (int i = 0; i < sx.length; i++)
			System.out.println("sx[" + i + "] = \"" + sx[i] + "\"");		
	}
}

// 読み込んだ値に応じてジャンケンの手を表示（その１：if文）

import java.util.Scanner;

class FingerFlashing1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("手を選べ（0…グー／1…チョキ／2…パー）：");
		int hand = stdIn.nextInt();

		if (hand == 0)
			System.out.println("グー");
		else if (hand == 1)
			System.out.println("チョキ");
		else if (hand == 2)
			System.out.println("パー");
	}
}

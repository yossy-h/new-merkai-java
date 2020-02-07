// 読み込んだ値に応じてジャンケンの手を表示（0, 1, 2のみを受け付ける）

import java.util.Scanner;

class FingerFlashing {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int hand;

		do {
			System.out.print("手を選べ（0…グー／1…チョキ／2…パー）：");
			hand = stdIn.nextInt();
		} while (hand < 0 || hand > 2);

		switch (hand) {
		 case 0: System.out.println("グー");	break;
		 case 1: System.out.println("チョキ"); break;
		 case 2: System.out.println("パー");	break;
		}
	}
}

// 読み込んだ値に応じてジャンケンの手を表示（その２：switch文）

import java.util.Scanner;

class FingerFlashing2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("手を選べ（0…グー／1…チョキ／2…パー）：");
		int hand = stdIn.nextInt();

		switch (hand) {
		 case 0: System.out.println("グー");	break;
		 case 1: System.out.println("チョキ"); break;
		 case 2: System.out.println("パー");	break;
		}
	}
}

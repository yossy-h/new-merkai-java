// 数当てゲーム（0～99を当てさせる）

import java.util.*;

class Kazuate {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int no = rand.nextInt(100);	// 当てるべき数：0～99の乱数として生成

		System.out.println("数当てゲーム開始!!");
		System.out.println("0～99の数を当ててください。");

		int x;								// プレーヤが入力した数
		do {
			System.out.print("いくつかな：");
			x = stdIn.nextInt();

			if (x > no)
				System.out.println("もっと小さな数だよ。");
			else if (x < no)
				System.out.println("もっと大きな数だよ。");
		} while (x != no);

		System.out.println("正解です。");
	}
}

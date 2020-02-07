// 暗算力トレーニング

import java.util.Random;
import java.util.Scanner;

class MentalArithmetic {

	static Scanner stdIn = new Scanner(System.in);

	//--- 続行の確認 ---//
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("もう一度？<Yes…1／No…0>：");
			cont = stdIn.nextInt();
		} while (cont != 0 && cont != 1);
		return cont == 1; 
	}

	public static void main(String[] args) {
		Random rand = new Random();

		System.out.println("暗算力トレーニング!!");
		do {
			int x = rand.nextInt(900) + 100;		// 3桁の数
			int y = rand.nextInt(900) + 100;		// 3桁の数
			int z = rand.nextInt(900) + 100;		// 3桁の数

			while (true) {
				System.out.print(x + " + " + y + " + " + z + " = ");
				int k = stdIn.nextInt();			// 読み込んだ値
				if (k == x + y + z)				// 正解
					break;
				System.out.println("違いますよ!!");
			}
		} while (confirmRetry());
	}
}

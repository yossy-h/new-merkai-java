// 円の面積を求める（円周率Math.PIを静的インポート）

import java.util.Scanner;
import static java.lang.Math.PI;

class Circle2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("円の面積を求めます。");
		System.out.print("半径：");
		double r = stdIn.nextDouble();
		System.out.println("面積は" + (PI * r * r) + "です。");
	}
}

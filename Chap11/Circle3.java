// 円の面積を求める（System.inとSystem.outを静的インポート）

import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.System.in;
import static java.lang.System.out;

class Circle3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(in);
		out.println("円の面積を求めます。");
		out.print("半径：");
		double r = stdIn.nextDouble();
		out.println("面積は" + (PI * r * r) + "です。");
	}
}

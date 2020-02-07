// 円の面積を求める

import java.util.Scanner;

class Circle1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("円の面積を求めます。");
		System.out.print("半径：");
		double r = stdIn.nextDouble();
		System.out.println("面積は" + (Math.PI * r * r) + "です。");
	}
}

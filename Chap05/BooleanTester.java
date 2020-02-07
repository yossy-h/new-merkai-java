// 関係演算子・等価演算子・論理否定演算子が生成する値を表示

import java.util.Scanner;

class BooleanTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a："); int a = stdIn.nextInt();
		System.out.print("整数b："); int b = stdIn.nextInt();

		System.out.println("a <  b  = " + (a <  b));
		System.out.println("a <= b  = " + (a <= b));
		System.out.println("a >  b  = " + (a >  b));
		System.out.println("a >= b  = " + (a >= b));
		System.out.println("a == b  = " + (a == b));
		System.out.println("a != b  = " + (a != b));
		System.out.println("!(a==0) = " + !(a == 0));
		System.out.println("!(b==0) = " + !(b == 0));
	}
}

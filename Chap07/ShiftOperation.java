// int型の値を左右にシフトした値を表示

import java.util.Scanner;

class ShiftOperation {

	//--- int型のビット構成を表示 ---//
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数：");					int x = stdIn.nextInt();
		System.out.print("シフトするビット数：");	int n = stdIn.nextInt();

		System.out.print(  "整数    = ");  printBits(x);
		System.out.print("\nx <<  n = ");  printBits(x << n);
		System.out.print("\nx >>  n = ");  printBits(x >> n);
		System.out.print("\nx >>> n = ");  printBits(x >>> n);
	}
}

// １桁（0～9）の加算を行う

import java.util.Scanner;

//---- 範囲外例外 ---//
class RangeError extends RuntimeException {
	RangeError(int n) { super("範囲外の値：" + n); }
}

//---- 範囲外例外（仮引数）---//
class ParameterRangeError extends RangeError {
	ParameterRangeError(int n) { super(n); }
}

//---- 範囲外例外（返却値）---//
class ResultRangeError extends RangeError {
	ResultRangeError(int n) { super(n); }
}

public class RangeErrorTester {

	/*--- nは１桁（0～9）か？ ---*/
	static boolean isValid(int n) {
		return n >= 0 && n <= 9;
	}

	/*--- １桁（0～9）の整数aとbの和を求める ---*/
	static int add(int a, int b) throws ParameterRangeError, ResultRangeError {
		if (!isValid(a)) throw new ParameterRangeError(a);
		if (!isValid(b)) throw new ParameterRangeError(b);
		int result = a + b;
		if (!isValid(result)) throw new ResultRangeError(result);
		return result;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");  int a = stdIn.nextInt();
		System.out.print("整数b：");  int b = stdIn.nextInt();

		try {
			System.out.println("それらの和は" + add(a, b) + "です。");
		} catch (ParameterRangeError e) {
			System.out.println("加える数が範囲外です。" + e.getMessage());
		} catch (ResultRangeError e) {
			System.out.println("計算結果が範囲外です。" + e.toString());
		}
	}
}

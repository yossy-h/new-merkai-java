// 整数型から浮動小数点型への変換（精度が失われる例）

class IntegralToFloat {

	public static void main(String[] args) {
		int  a = 123456789;
		long b = 1234567890123456789L;

		System.out.println("        a = " +        a);
		System.out.println("(float) a = " + (float)a);

		System.out.println("        b = " +         b);
		System.out.println("(double)b = " + (double)b);
	}
}

// float型とdouble型の精度が有限であることを体感

class FloatDouble {

	public static void main(String[] args) {
		float  a = 123456789;
		double b = 1234567890123456789L;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}

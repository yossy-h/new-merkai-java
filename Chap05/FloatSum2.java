// 0.0から1.0まで0.001単位で増やして合計を表示（繰返しをintで制御）

class FloatSum2 {

	public static void main(String[] args) {
		float sum = 0.0F;

		for (int i = 0; i <= 1000; i++) {
			float x = (float)i / 1000;
			System.out.println("x = " + x);
			sum += x;
		}
		System.out.println("sum = " + sum);
	}
}

// final仮引数に値を代入できないことを確認

class FinalParameter {
	//--- 三つの仮引数の値の和を求める ---//
	static int sumOf(final int x, final int y, final int z) {
	// x = 10;
		return x + y + z;
	}

	public static void main(String[] args) {
		System.out.println(sumOf(1, 2, 3));
	}
}

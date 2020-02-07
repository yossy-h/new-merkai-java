// 実引数の評価順序を確認

class Argument {
	//--- 三つの引数の値を表示 ---//
	static void method(int x, int y, int z) {
		System.out.println("x = " + x + "  y = " + y + "  z = " + z);
	}

	public static void main(String[] args) {
		int i = 0;
		method(i, i = 5, ++i);
	}
}

// 構成要素型がint型の配列（構成要素数は５：newによって本体を生成）

class IntArray1 {

	public static void main(String[] args) {
		int[] a = new int[5];	// 配列の宣言

		a[1] = 37;					// a[1]に37を代入
		a[2] = 51;					// a[2]に51を代入
		a[4] = a[1] * 2;			// a[4]に74を代入

		// 全要素の値を表示
		System.out.println("a[" + 0 + "] = " + a[0]);
		System.out.println("a[" + 1 + "] = " + a[1]);
		System.out.println("a[" + 2 + "] = " + a[2]);
		System.out.println("a[" + 3 + "] = " + a[3]);
		System.out.println("a[" + 4 + "] = " + a[4]);
	}
}

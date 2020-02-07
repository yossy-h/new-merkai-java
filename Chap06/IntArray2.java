// 配列の各要素に1, 2, 3, 4, 5を代入して表示

class IntArray2 {

	public static void main(String[] args) {
		int[] a = new int[5];	// 配列の宣言

		for (int i = 0; i < a.length; i++)
			a[i] = i + 1;

		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}

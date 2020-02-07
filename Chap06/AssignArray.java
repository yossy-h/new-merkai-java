// 配列の代入（間違い）

class AssignArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {6, 5, 4, 3, 2, 1, 0};

		System.out.print("a = ");			// 配列aの全要素を表示
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		System.out.print("b = ");			// 配列bの全要素を表示
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
		System.out.println();
	
		b = a;					// 配列aをbにコピー（？）

		a[0] = 10;				// 配列a[0]の値を書きかえる

		System.out.println("aをbに代入しました。 ");
		System.out.print("a = ");			// 配列aの全要素を表示
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		System.out.print("b = ");			// 配列bの全要素を表示
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
		System.out.println();
	}
}

// 識別子の有効範囲を確認する

class Scope {

	static int x = 700;

	static void printX() {
		System.out.println("x = " + x);
	}

	public static void main(String[] args) {
		System.out.println("x = " + x);

		int x = 800;

		System.out.println("x = " + x);

		System.out.println("Scope.x = " + Scope.x);

		printX();
	}
}

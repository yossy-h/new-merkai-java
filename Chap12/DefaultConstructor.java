// スーパークラスとサブクラス（デフォルトコンストラクタの働きを確認）

// スーパークラス
class A {
	private int a;

	A() { a = 50; }

	int getA() { return a; }
}

// サブクラス
class B extends A {
	// コンストラクタを定義していない（デフォルトコンストラクタが生成される）
}

public class DefaultConstructor {

	public static void main(String[] args) {
		B x = new B();

		System.out.println("x.getA() = " + x.getA());
	}
}

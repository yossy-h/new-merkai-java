// クラス／インスタンス フィールド と クラス／インスタンス メソッド

class Static {
	private static int s;			// ■静　的フィールド（クラス変数）
	private int a;						// □非静的フィールド（インスタンス変数）

	public static void m1() { }	// ●静　的メソッド①（クラスメソッド）
	public        void f1() { }	// ○非静的メソッド①（インスタンスメソッド）

	//-- ●静的メソッド②（クラスメソッド） --//
	public static void m2(int x) {
		s = x;		// ■静　的フィールドにはアクセスできる
//	   a = x;		// □非静的フィールドにはアクセスできない（エラー）
		m1();			// ●静　的メソッドは呼び出せる
//	   f1();			// ○非静的メソッドは呼び出せない（エラー）
	}

	//-- ○非静的メソッド②（インスタンスメソッド） --//
	public void f2(int x) {
		s = x;		// ■静　的フィールドにアクセスできる
		a = x;		// □非静的フィールドにアクセスできる
		m1();			// ●静　的メソッドは呼び出せる
		f1();			// ○非静的メソッドは呼び出せる
		System.out.println("s = " + s + "  a = " + a);
	}
}

public class StaticTester {
	public static void main(String[] args) {
		Static c1 = new Static();
		Static c2 = new Static();

		Static.m2(5);
		c1.f2(10);
		c2.f2(20);
	}
}

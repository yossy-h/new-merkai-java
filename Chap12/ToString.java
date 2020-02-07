// toStringが返却する文字列を表示するメソッド（すべてのクラス型に対応）

class X {
	public String toString() {
		return "Class X";
	}
}

class Y extends X {
	public String toString() {
		return "Class Y";
	}
}

public class ToString {

	//--- toStringメソッドが返却する文字列を表示 ---//
	static void print(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		int[] c = new int[5];

		print(x);
		print(y);
		print(c);
	}
}

//--- 動物クラスのテスト ---//
public class AnimalTester {

	public static void main(String[] args) {
		Animal[] a = {
			new Dog("タロー", "柴犬"),		// 犬
			new Cat("マイケル", 7),			// 猫
			new Dog("ハチ公", "秋田犬"),	// 犬
		};

		for (Animal k : a) {
			k.introduce();				// kの参照しているインスタンスの型に応じた
			System.out.println();	// 							メソッドが呼び出される
		}
	}
}

//--- 動物クラス ---//
public abstract class Animal {
	private String name;			// 名前

	public Animal(String name) { this.name = name; }

	public abstract void bark();			// 吠える
	public abstract String toString();	// 文字列表現を返す

	public String getName() { return name; }

	public void introduce() {
		System.out.print(toString() + "だ");
		bark();
	} 
}

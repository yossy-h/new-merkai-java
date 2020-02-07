//--- 猫クラス ---//
public class Cat extends Animal {
	private int age;				// 年齢

	public Cat(String name, int age) { super(name);  this.age = age; }

	public void bark() { System.out.println("ニャ～ン!!"); }

	public String toString() { return age + "歳の" + getName(); }
}

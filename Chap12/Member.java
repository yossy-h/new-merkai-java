//--- 会員クラス ---//
public class Member {
	private String name;		// 名前
	private int no;			// 会員番号
	private int age;			// 年齢

	public Member(String name, int no, int age) {
		this.name = name;  this.no = no;  this.age = age;
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println("No." + no + "：" + name +
								 "（" + age + "歳）");
	}
}

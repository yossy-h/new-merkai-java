//--- 会員クラス ---//
class Member {
	private String name;		// 名前
	private int no;			// 会員番号
	private int age;			// 年齢

	Member(String name, int no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}

	void print() {
		System.out.println("No." + no + "：" + name +
								 "（" + age + "歳）");
	}
}

//--- 優待会員クラス ---//
public class SpecialMember extends Member {
	private String privilege;		// 特典

	public SpecialMember(String name, int no, int age, String privilege) {
		super(name, no, age);  this.privilege = privilege; 
	}

	@Override public void print() {
		super.print();
		System.out.println("特典：" + privilege);
	}
}

//--- 識別番号付き３次元座標クラスのテスト ---//
public class Point3DTester {

	public static void main(String[] args) {
		Point3D p1 = new Point3D();
		Point3D p2 = new Point3D(1);
		Point3D p3 = new Point3D(2, 3);
		Point3D p4 = new Point3D(4, 5, 6);

		System.out.println("最後に与えた識別番号：" + Point3D.getCounter());
		System.out.println("p1 = " + p1 + " … 識別番号：" + p1.getId());
		System.out.println("p2 = " + p2 + " … 識別番号：" + p2.getId());
		System.out.println("p3 = " + p3 + " … 識別番号：" + p3.getId());
		System.out.println("p4 = " + p4 + " … 識別番号：" + p4.getId());
	}
}

//--- 識別番号付き３次元座標クラス ---//

import java.util.Random;

public class Point3D {
	private static int counter = 0;	// 何番までの識別番号を与えたか
	private int id;						// 識別番号
	private int x = 0, y = 0, z = 0;	// 座標

	static { Random r = new Random(); counter = r.nextInt(10)*100;}

	{ id = ++counter; }

	public Point3D()							{ }
	public Point3D(int x)					{ this.x = x; }
	public Point3D(int x, int y)			{ this.x = x;  this.y = y; }
	public Point3D(int x, int y, int z) { this.x = x;  this.y = y;  this.z = z; }

	public static int getCounter() { return counter; }

	public int getId() { return id; }

	public String toString() {
		return "(" + x  + "," + y + "," + z + ")";
	}
}
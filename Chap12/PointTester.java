// ２次元座標クラスと３次元座標クラス

// ２次元座標クラス
class Point2D {
	int x;	// Ｘ座標
	int y;	// Ｙ座標

	Point2D(int x, int y) { this.x = x; this.y = y; }

	void setX(int x) { this.x = x; }		// Ｘ座標を設定
	void setY(int y) { this.y = y; }		// Ｙ座標を設定

	int getX() { return x; }				// Ｘ座標を取得
	int getY() { return y; }				// Ｙ座標を取得
}

// ３次元座標クラス
class Point3D extends Point2D {
	int z;	// Ｚ座標

	Point3D(int x, int y, int z) { super(x, y); this.z = z; }

	void setZ(int z) { this.z = z; }		// Ｚ座標を設定
	int getZ() { return z; }				// Ｚ座標を取得
}

public class PointTester {

	public static void main(String[] args) {

		Point2D a = new Point2D(10, 15);
		Point3D b = new Point3D(20, 30, 40);

		System.out.printf("a = (%d, %d)\n",     a.getX(), a.getY());
		System.out.printf("b = (%d, %d, %d)\n", b.getX(), b.getY(), b.getZ());
	}
}

//--- ２次元座標クラス ---//
public class Point2D {
	private int x = 0;			// Ｘ座標
	private int y = 0;			// Ｙ座標

	public Point2D() { }
	public Point2D(int x, int y) { set(x, y); }
	public Point2D(Point2D p)    { this(p.x, p.y); }

	public int getX() { return x; }
	public int getY() { return y; }

	public void setX(int x)       { this.x = x; }
	public void setY(int y)       { this.y = y; }
	public void set(int x, int y) { setX(x);  setY(y); }

	public String toString() { return "(" + x + "," + y + ")"; }
}

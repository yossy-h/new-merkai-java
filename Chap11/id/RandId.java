// 識別番号クラス（パッケージに入れて実現）

package id;

import java.util.Random;

public class RandId {

	private static int counter;	// 何番までの識別番号を与えたか

	private int id;					// 識別番号

	static {
		Random rand = new Random();
		counter = rand.nextInt(10) * 100;		
	}

	//-- コンストラクタ --//
	public RandId() {
		id = ++counter;			// 識別番号
	}

	//--- 識別番号を取得 ---//
	public int getId() {
		return id;
	}
}

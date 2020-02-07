//--- テスト ---//
public class Test {

	public static void main(String[] args) {
		Wearable[] w = {
			new WearableComputer("HAL"),		// コンピュータ
			new WearableRobot(Color.RED),		// ロボット
			new WearableRobot(Color.GREEN),	// ロボット
		};

		for (Wearable k : w) {
			k.putOn();
			k.putOff();
			System.out.println();
		}
	}
}

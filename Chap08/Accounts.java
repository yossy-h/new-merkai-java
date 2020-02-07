// 二人分の銀行口座データを扱うプログラム

class Accounts {

	public static void main(String[] args) {
		String adachiAccountName    = "足立幸一";		// 足立君の口座名義
		String adachiAccountNo      = "123456";		// 　〃　の口座番号
		long   adachiAccountBalance = 1000;				// 　〃　の預金残高

		String nakataAccountName    = "仲田真二";		// 仲田君の口座名義
		String nakataAccountNo      = "654321";		// 　〃　の口座番号
		long   nakataAccountBalance = 200;				// 　〃　の預金残高

		adachiAccountBalance -= 200;						// 足立君が200円おろす
		nakataAccountBalance += 100;						// 仲田君が100円預ける

		System.out.println("■足立君の口座");
		System.out.println("　口座名義：" + adachiAccountName);
		System.out.println("　口座番号：" + adachiAccountNo);
		System.out.println("　預金残高：" + adachiAccountBalance);

		System.out.println("■仲田君の口座");
		System.out.println("　口座名義：" + nakataAccountName);
		System.out.println("　口座番号：" + nakataAccountNo);
		System.out.println("　預金残高：" + nakataAccountBalance);
	}
}

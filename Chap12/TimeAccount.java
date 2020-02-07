// 定期預金付き銀行口座クラス【試作版】

class TimeAccount {
	private String name;				// 口座名義
	private String no;				// 口座番号
	private long balance;			// 預金残高
	private long timeBalance;		// 預金残高（定期預金）

	//--- コンストラクタ ---//
	TimeAccount(String n, String num, long z, long timeBalance) {
		name = n;								// 口座名義
		no = num;								// 口座番号
		balance = z;							// 預金残高
		this.timeBalance = timeBalance;	// 預金残高（定期預金）
	}

	//--- 口座名義を調べる ---//
	String getName() {
		return name;
	}

	//--- 口座番号を調べる ---//
	String getNo() {
		return no;
	}

	//--- 預金残高を調べる ---//
	long getBalance() {
		return balance;
	}

	//--- 定期預金残高を調べる ---//
	long getTimeBalance() {
		return timeBalance;
	}

	//--- k円預ける ---//
	void deposit(long k) {
		balance += k;
	}

	//--- k円おろす ---//
	void withdraw(long k) {
		balance -= k;
	}

	//--- 定期預金を解約して全額を普通預金に移す ---//
	void cancel(long k) {	
		balance += timeBalance;
		timeBalance = 0;
	}
}

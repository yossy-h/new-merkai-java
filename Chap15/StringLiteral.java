// 同一綴りの文字列の参照先を比較

class StringLiteral {

	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "ABC";

		if (s1 == s2)	// 参照先を比較
			System.out.println("s1とs2は同じ文字列を参照。");
		else
			System.out.println("s1とs2は違う文字列を参照。");
	}
}

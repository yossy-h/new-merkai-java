// 文字列参照先の変更

class ChangeString {

	public static void main(String[] args) {
		String s1 = "ABC";		// "ABC"を参照
		String s2 = "XYZ";		// "XYZ"を参照

		s1 = "XYZ";					// "XYZ"を参照
		System.out.println("文字列s1 = " + s1);
		System.out.println("文字列s2 = " + s2);
		System.out.println("s1とs2は同じ文字列リテラルを参照" +
									((s1 == s2) ? "している。" : "していない。"));
	}
}

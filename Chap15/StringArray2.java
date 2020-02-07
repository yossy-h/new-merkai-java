// 文字列の配列（１文字ずつ表示）

class StringArray2 {

	public static void main(String[] args) {
		String[] sx = {"Turbo", "NA", "DOHC"};

		for (int i = 0; i < sx.length; i++) {
			System.out.print("sx[" + i + "] = \"");	
			for (int j = 0; j < sx[i].length(); j++)
				System.out.print(sx[i].charAt(j));	
			System.out.println('\"');	
		}
	}
}

// コマンドライン引数で与えられたすべての数値を加算して表示

class SumOfArgs {

	public static void main(String[] args) {
		double sum = 0.0;
		for (int i = 0; i < args.length; i++)
			sum += Double.parseDouble(args[i]);
		System.out.println("合計は" + sum + "です。");
	}
}

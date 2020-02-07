import java.util.Scanner;

//---- 自作の検査例外 ---//
class CheckedException extends Exception {
	CheckedException(String s, Throwable e) { super(s, e); }
}

//---- 自作の非検査例外 ---//
class UncheckedException extends RuntimeException {
	UncheckedException(String s, Throwable e) { super(s, e); }
}

public class Abc {

	//--- swの値に応じて例外を発生 ---//
	static void work(int sw) throws Exception {
		switch (sw) {
		 case 1: throw new RuntimeException("非検査例外発生!!"); 
		 case 2: throw new Exception("検査例外発生!!");
		}
	}

	//--- workを呼び出す ---//
	static void test(int sw) throws CheckedException {
		try {
			work(sw);
		} catch (RuntimeException e) {
			/* 対処を試みたが対処しきれなかった */
			throw new UncheckedException("非検査例外対処不能!!", e);
		} catch (Exception e) {
			/* 対処を試みたが対処しきれなかった */
			throw new CheckedException("検査例外対処不能!!", e);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("sw：");
		int sw = stdIn.nextInt();

		try {
			test(sw);
		} catch (Exception e) {
			System.out.println("例外　　　：" + e);
			System.out.println("例外の原因：" + e.getCause());
			e.printStackTrace();
		}
	}
}

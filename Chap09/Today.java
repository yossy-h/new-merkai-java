// 今日の日付を表示

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

class Today {

	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		System.out.printf("今日は%04d年%02d月%02d日です。\n",
								today.get(YEAR),			// 年
								today.get(MONTH) + 1,	// 月
								today.get(DATE)			// 日
							  );
	}
}

package J03;

public class J032_vartest {

	public static void main(String[] args) {
		/* 區域變數類型推斷宣告 var 
		 * 1.var 宣告只能在"區域變數"宣告,"不能用在": 
		 *  a."類別變數"或"物件變數"宣告 
		 *  b.方法的"參數"或"回傳值"
		 * 2.var 在宣告區域變數時"一定要指定初始值",否則沒有辦法推定資料型態
		 */
		var a = 10;
		var b = 10.2;
		var c = 'A';
		var d = false;
		// var e;//此行編譯錯誤,因為無法推定類型,沒有給定初始值

		double x = 0.3 + 0.3 + 0.3;
		System.out.println(x);
		if (x == 0.9)
			System.out.println("相等");
		else
			System.out.println("奇怪哩,怎麼不相等");
		
	}

}

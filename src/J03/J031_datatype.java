package J03;

public class J031_datatype {
	
	static int A;
	static int B = 300;
	static void test(){
		System.out.println("B = " + B);
		//System.out.println("C = " + C);//C cannot be resolved to a variable
	}
	/* 若存在global或heap區的變數(類別變數,或物件變數)
	 * 	,編譯器會自動給訂初值,不同資料的初值如下
	 * 整數 0
	 * 浮點數 0.0
	 * 字元 空字元 \u0000
	 * 布林 false
	 */
	static int intVar;
	static double doubleVar;
	static char charVar;
	static boolean booleanVar;
	
	public static void main(String[] args) {
		
		/* 變數命名規則的法律問題
		 * 1.變數名稱首字母一定為英文字母 , 或 _ 或 $ 其他皆不同當首字母
		 * 2.變數名稱可為英文字或數字,但不能有特殊符號 + - / = ...
		 * 3.關鍵字,保留字不能宣告為變數 例 int public static void ...... 
		 */
		/* 變數宣告語法
		 * 1.資料型態 變數名稱[=初始值]; []可有可無
		 * 2.區域變數(在方法內宣告的變數,必須設定初始值才可以運算,否則編譯錯誤)
		 *  ,但物件變數或類別變數,編譯器會自動給定初始值
		 * 3.變數的生命週期
		 *  a.看成全域變數(如物件變數,類別變數),生命貫穿整個類別
		 *  b.區域變數,生命只存於方法內,離開方法消失
		 *  c.區塊變數,在方法內用{ }內宣告的變數,生命最短,只存於此大括號內
		 */
		int A = 10;
		System.out.println("A = " + A);				//印區域變數age
		System.out.println("A = " + J031_datatype.A);	//印類別變數age
		System.out.println("B = " + B);
		test();
		int C = 180;
		{
			int a=100;
			System.out.println("C = " + C);
		}
		//a=200;//a cannot be resolved to a variable
		
		//整數資料型態 byte short int(預設) long,"算術運算子運算結果"也是存在 int 的暫存內
		System.out.println(2147483647);
		System.out.println(2147483648l);
		System.out.println(2147483648L);
		int a = 1;
		a = a + 1;
		short b = 1;
		b = (short)(b + 1);
		
		//浮點數 float double(預設)
		float c = 1;
		float d = 1.0f;
		double e = 2.53;
		
		//字元 char 以 ' ' 單引號瓜住一個字元'A'
		//字串是以雙引號 " " 括住一串字 "hello java"
		//字元也可以是escape character(跳脫字元) \n \t,或是unicode \u7190
		char gender = 'M';
		char f = '\n';
		System.out.println("今天" + "天氣");
		System.out.println("今天" + f + "天氣");
		System.out.println("今天\n天氣");
		char g = '熱';
		int h = g;
		System.out.println(h);
		char i = 29105;
		System.out.println(i);
		System.out.println("29105轉乘16進制後為:"+Integer.toHexString(29105));
		char j = '\u71b1';		//此為unicode字元編碼
		System.out.println("unicode的71b1 = " + j);
		char s = 'A';
		char t = 65;			//十進制
		char u = 0_101;		//八進制
		char v = 0x41;			//十六進制
		char w = 0b10_000_01;	//二進制
		char x = '\u0000';		//空字元
		System.out.println("10" + t + ",8" + u + x + ",16" + v + ",2" + w);
		
		int y = 123_456_7;		//底線前後一定要為數字才可以
		System.out.println(y);
		double z = 1_23.4_56;
		System.out.println(z);
	
		// 布林值 boolean java的boolean只能為 true 或 false
	
		System.out.println("intVar = \t" + intVar);
		System.out.println("doubleVar = \t" + doubleVar);
		System.out.println("charVar = \t" + charVar);
		System.out.println("booleanVar = \t" + booleanVar);
		
	}

}

package J04;

enum PowerState {
	ON, OFF, SUSPEND, ERROR;// 類別變數、常數，皆已加上static,final
}

public class J041_operator {

	static String name;
	
	static String showDescription(PowerState state) {
		switch (state) {
		case ON:
			return "努力工作中";
			// break;//有return返回，不用加break//Unreachable code
		case OFF:
			return "太累了，關門了";
		case SUSPEND:
			return "偷懶中";
			// System.out.println("這一行永遠不會執行");//Unreachable code
		default:
			return "已經掛掉了";
		}
	}

	public static void main(String[] args) {
		/* 資料型態轉型 
		 * 1.小變大,自動轉型(implicit casting):byte->short(char)->int->long->float->double 
		 * 2.大變小,強制轉型(explicit casting)
		 */
		byte a = 10, c = 10;
		short b = 10, d = 10;
		b = a; 				// 自動轉型
		c = (byte) d; 		// 強制轉型
		final byte e = 10; 	// 加final後為常數，不能再更改
		short f = 10;
		f = e; 				// 自動轉型
		// e = (byte)f; 	//加final,無法強制轉型
		// The final local variable e cannot be assigned. It must be blank and not using a compound assignment
		short g = 257; 		// 100000001
		byte h = (byte) g; 	//  00000001 //只保留8位元
		System.out.println(h);

		System.out.println("今天天氣很好");
		System.out.print("今天");
		System.out.print("天氣很好");
		System.out.print("\n今天天氣很好\n");
		System.out.println(1 + 2 + 3);// 6
		System.out.println("1" + 2 + 3);// 123
		System.out.println(1 + "2" + 3);// 123
		System.out.println(1 + 2 + "3");// 33
		System.out.println('1' + 2 + "3");// 513
		// A -> 65
		// a -> 97
		// 0 -> 48
		// 1 -> 49

		/* 格式化輸出 printf() 
		 * 語法 printf("格式字元",變數); 
		 * 格式字元 %%百分比符號 %d整數十進制 %#o八進制 %#x十六進制 %f浮點數 %e科學記號浮點數 
		 * 			%s字串小寫 %S字串大寫 %c字元 %b布林 %n換行
		 */
		String name = "Kynton";
		System.out.println(name);
		System.out.println(J041_operator.name);
		byte age = 65;
		double height = 180.1;
		char blood = 'A';
		double money = 56789.1234;
		boolean gender = true;
		System.out.printf("%%我的名子叫%S,今年%d歲,身高%.2f公分,血型%c型,存款有%e,我是%s%n"
							, name, age, height, blood, money, gender ? "男生" : "女生");
		// "注意" RuntimeException

		byte k = 1;
		// k=k+1;//放到int的暫存,報錯
		k += 1;
		k++;
		System.out.println(k);
		int aa = 5, bb = 5, cc = 0;
		cc = ++aa + bb++ + ++aa;
		System.out.printf("aa = %d, bb = %d, cc = %d%n", aa, bb, cc);// a=7,b=6,c=18
		// ^ XOR 相同為0相異為1
		System.out.println(10 > 3 ^ 10 > 3);// false
		System.out.println(10 > 3 ^ 10 < 3);// true

		/* switch 比對參數只能為 
		 * a.整數，且小於等於int 
		 * b.字元 
		 * c.字串 
		 * d.列舉(enum)
		 */
		int level = 2;
		switch (level) {
		case 1:
			System.out.println(1);
			break;
		case 2:
		case 3:
			System.out.println("ok");
			break;
			// System.out.println("這一行永遠不會執行");//Unreachable code
		default:// 沒有 break 才會執行 default
			System.out.println("default");
		}

		J041_Son s = new J041_Son();
		s.test();

		System.out.println(showDescription(PowerState.SUSPEND));

	}

}

//final class Father{}
//class Son extends Father{}
//加final後不能再繼承 The type Son cannot subclass the final class Father

class J041_Father {
	final void test() {
		System.out.println("Hi");
	}
}

class J041_Son extends J041_Father {
	// @Override
	// void test() {}
	// 加final後不能再覆寫 Cannot override the final method from Father
}
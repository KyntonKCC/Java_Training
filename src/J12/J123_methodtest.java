package J12;

public class J123_methodtest {

	public static void main(String[] args) {// 類別方法
		/* 1.物件方法(沒有static修飾字的方法)-->"可以直接呼叫"另一個物件方法或另一個類別方法
		 * 2.類別方法(有static修飾字的方法)-->可以直接呼叫另一個類別方法
		 * ,但無法直接呼叫物件方法,需new一個類別物件,才可以用物件.物件方法()來呼叫
		 * 3.在類別方法內是不能使用this物件參考的關鍵字,this.只能用在物件方法中 
		 * 4.切記,方法內是無法在宣告另一個方法
		 */
		J123_methodtest o1 = new J123_methodtest();
		o1.objectMethod1();
		staticMethod1();
		/* 這是物件方法1 
		 * 這是類別方法1 
		 * 這是物件方法2 
		 * 這是類別方法2 
		 * 這是物件方法2 
		 * 這是類別方法1 
		 * 這是物件方法2 
		 * 這是類別方法2
		 */
	}

	static void staticMethod1() { 							// 類別方法
		System.out.println("這是類別方法1");
		new J123_methodtest().objectMethod2(); 				// 用匿名物件呼叫
		staticMethod2();
	}

	static void staticMethod2() { 							// 類別方法
		System.out.println("這是類別方法2");
	}

	void objectMethod1() { 									// 物件方法
		System.out.println("這是物件方法1");
		J123_methodtest.staticMethod1();// staticMethod1(); // 完整
		this.objectMethod2();// objectMethod2(); 			// 完整
	}

	void objectMethod2() { 									// 物件方法
		System.out.println("這是物件方法2");
	}

}

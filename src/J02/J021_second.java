package J02;

import java.util.Scanner;

//編譯 Hello.java ->
//$ javac Hello.java
//執行(byte code) Hello.class ->
//$ java Hello
//編譯 + 執行(不產生(byte code)) ->
//$ java Hello.java

public class J021_second {
	
	public static void main(String[] args) {
		 Scanner keyboard = new Scanner(System.in);
		// Ctrl+Shift+O:import relative package

        J021_Father.staticMethod();
        // J021_Father.objectMethod();//此行錯誤，無法直接呼叫物件方法
        J021_Father daddy = new J021_Father();
        daddy.objectMethod();
	}
	
}

/* 當一個類別裡面的方法，全部都是有加static的類別方法，則此類別，我們稱為工具類別 
 * 例如Math類別,Arrays類別....
 */

class J021_Father {
	// 類別方法，可以直接呼叫，不用產生類別物件再呼叫
	static void staticMethod() {
		System.out.println("這是類別方法");
	}
	// 物件方法，不可以直接呼叫，需產生類別物件後，再利用物件.物件方法來呼叫
	void objectMethod() {
		System.out.println("這是物件方法");
		//return;//return void; 回傳空值
	}
}
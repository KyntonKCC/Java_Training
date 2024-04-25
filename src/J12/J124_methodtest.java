package J12;

import java.util.Arrays;

public class J124_methodtest {

	public static void main(String[] args) {
		/* 傳值呼叫(Call by Value)/傳位置呼叫(Call by Address)
		 * 1.若傳遞的參數為"基本資料型態"(byte,short,char,int,long,float,double,boolean) 
		 * ,則為call by value,因其是將"值複製"一份到方法端,呼叫端與方法端各自有一份,彼此不受影響 
		 * 2.若傳遞的參數為"參考資料型態",則為call by address
		 * ,因其是將"位置複製"一份到方法端,呼叫端與方法端參照到同一個地址,彼此受影響
		 */

		int m = 100;
		System.out.println("主方法內,未呼叫callByValue方法前的m=" + m);// 100
		callByValue(m);
		System.out.println("主方法內,呼叫callByValue方法後的m=" + m);// 100

		int n[] = { 1, 2, 3, 4, 5 };
		System.out.println("主方法內,未呼叫callByAddress方法前的n=" + Arrays.toString(n));// [1,2,3,4,5]
		callByAddress(n);
		System.out.println("主方法內,呼叫callByAddress方法前的n=" + Arrays.toString(n));// [101,102,103,104,105]

		J124_Rectangle rec = new J124_Rectangle();
		System.out.printf("主方法內,未呼叫changeValue方法前的寬為:%d,長為:%d,面積為:%d\n", rec.width, rec.length, rec.width * rec.length);// 5,5,25
		changeValue(rec);
		System.out.printf("主方法內,呼叫changeValue方法後的寬為:%d,長為:%d,面積為:%d\n", rec.width, rec.length, rec.width * rec.length);// 100,100,10000

	}

	static void callByValue(int m) {
		System.out.println("callByValue方法內運算前的m=" + m);// 100
		m += 500;
		System.out.println("callByValue方法內運算後的m=" + m);// 600
	}

	static void callByAddress(int[] n) {
		System.out.println("callByAddress方法內運算前的n=" + Arrays.toString(n));// [1,2,3,4,5]
		for (int i = 0; i < n.length; i++) 
			n[i] += 100;
		System.out.println("callByAddress方法內運算後的n=" + Arrays.toString(n));// [101,102,103,104,105]
	}

	static void changeValue(J124_Rectangle rec) {
		System.out.printf("changeValue方法內改變前的寬為:%d,長為:%d,面積為:%d\n", rec.width, rec.length, rec.width * rec.length);// 5,5,25
		rec.length = 100;
		rec.width = 100;
		System.out.printf("changeValue方法內改變後的寬為:%d,長為:%d,面積為:%d\n", rec.width, rec.length, rec.width * rec.length);// 100,100,10000
	}
}

class J124_Rectangle {
	int length = 5;
	int width = 5;
}

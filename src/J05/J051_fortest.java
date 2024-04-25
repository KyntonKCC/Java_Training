package J05;

import java.util.Scanner;

public class J051_fortest {

	public static void main(String[] args) {
		/* 迴圈 for loop分為兩種 
		 * 1.standard for loop
		 * 語法 for(初始;條件;增減值) 
		 *  a.可以順著印 
		 *  b.可以倒著印 
		 *  c.可以交替印
		 * 2.enhance for loop(for each)
		 * 語法 for(陣列資料型態 變數名稱:資料名稱) 
		 *  只能順著印
		 */
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int m = 0; m < a.length; m++) 		// 順著印
			System.out.print(a[m] + " ");
		System.out.println();
		for (int m = a.length - 1; m >= 0; m--) // 倒著印
			System.out.print(a[m] + " ");
		System.out.println();
		for (int m = 0; m < a.length; m += 2) 	// 交替印
			System.out.print(a[m] + " ");
		System.out.println();
		for (int x : a) // 利用foreach印出陣列內容
			System.out.print(x + " ");
		System.out.println();

		for (int m = 1; m <= 5; m++) {// 3
			if (m == 3) {
				System.out.print(m + " ");
				continue;
				// System.out.print(m+" ");//編譯錯誤，此行永遠無法執行
			}
		}
		System.out.println();
		for (int m = 1; m <= 5; m++) {// 1 2 4 5
			if (m == 3) continue;
			System.out.print(m + " ");
		}
		System.out.println();
		for (int m = 1; m <= 5; m++) {// 1 2
			if (m == 3) break;
			System.out.print(m + " ");
		}
		System.out.println();
		for (int p = 1; p <= 5; p++) {
			System.out.print("p=" + p);
			for (int m = 1; m <= 5; m++) {
				if (m == 3) break; // break中斷內迴圈
				System.out.print(" m=" + m);
			}
			System.out.println();
		}
		KyntonKCC: // Label標籤,中斷外迴圈
		for (int p = 1; p <= 5; p++) {
			System.out.print("p=" + p);
			for (int m = 1; m <= 5; m++) {
				if (m == 3) break KyntonKCC;
				System.out.print(" m=" + m);
			}
			System.out.println();
		}
		System.out.println();
		int aa = 50;
		while (aa < 3) { // 前置迴圈如果是 false 為垃圾程式 //a為變數
			System.out.println("*");
		}
		do { // 後置迴圈可為false 因為已經執行一次
			System.out.println("*");
		} while (false);

		System.out.print("請輸入最大數:");
		Scanner keyboard = new Scanner(System.in);
		int max = Integer.parseInt(keyboard.nextLine());
		int no1 = 1, no2 = 1, no3 = 2;
		System.out.print(no1 + " " + no2);
		while (no3 <= max) {
			System.out.print(" " + no3);
			no1 = no2;
			no2 = no3;
			no3 = no1 + no2;
		}
		System.out.println();
		
	}

}

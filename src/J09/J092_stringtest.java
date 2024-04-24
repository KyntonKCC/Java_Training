package J09;

import javax.swing.JOptionPane;

public class J092_stringtest {

	public static void main(String[] args) {
		// 判斷使用者輸入的字串是否為迴文
		String temp = JOptionPane.showInputDialog("請輸入任意英文字");
		System.out.printf("%s%s迴文\n", temp, isPalim(temp) ? "是" : "不是");

		int age1 = 25;
		int age2 = 30;
		String s1 = String.format("今年%2$d歲\n", age1, age2);// 以n$指定變數
		String s2 = String.format("今年%d,%<4d歲\n", age1);// 以<指定以前面的變數取代
		System.out.print(s1);
		System.out.print(s2);

	}

	// 宣告判斷字串是否為迴文的方法
	static boolean isPalim(String temp) {
		// 將所有字元轉為大寫
		temp = temp.toUpperCase();
		int low = 0;// 取得第一個字
		int high = temp.length() - 1;// 取得最後一個字
		while (low < high) {
			if (temp.charAt(low) != temp.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}
}

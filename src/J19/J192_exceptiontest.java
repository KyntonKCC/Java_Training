package J19;

import java.io.IOException;

public class J192_exceptiontest {

	public static void main(String[] args) {
		try {
			int[] a = new int[2];
			a[2] = 5;
			System.out.println(10 / 0);
		} catch (NullPointerException | IndexOutOfBoundsException | ArithmeticException e) { // 不能有繼承關係
			e.printStackTrace();
		}
		System.out.println("ok");

		d();

		try {
			int a = Integer.parseInt(args[0]);// (第三步驟)
			int b = Integer.parseInt(args[1]);
			int result = divMethod(a, b);
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("必須輸入為數字");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("必須輸入二個數字");
		} catch (ArithmeticException e) {
			System.out.println("除數不能為零");
		} catch (J192_MinusException e) {// 自定的方法
			System.out.println(e.getMessage());
		}

		// 啟動斷言 -> run as -> run configuration -> VM argument -> -ea
		// //java.lang.AssertionError
		int score = -100;
		assert (score >= 0) : "成績有問題";

	}

	static void d() {
		try {
			c();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void c() throws Exception {
		b();
	}

	static void b() throws IOException {
		a();
	}

	static void a() throws IOException {
		throw new IOException("沒事產生例外");
	}

	// 宣告divMethod方法用來求二數相除(第二步驟)
	public static int divMethod(int a, int b) throws J192_MinusException {
		if (a < 0 || b < 0) {
			throw new J192_MinusException("輸入不能為負數");
		}
		return a / b;
	}
}

//自訂例外類別(第一步驟)
class J192_MinusException extends Exception {
	J192_MinusException() {

	};

	J192_MinusException(String msg) {
		super(msg);
	}
}

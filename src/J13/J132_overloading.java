package J13;

public class J132_overloading {

	public static void main(String[] args) {
		test();
		test(1);
		test(1.0);
		test(1, 1.0);
		test(1.0, 1);
		// test(1,1);//type Overloading

		String a = "=";
		// 呼叫變動參數的前世
		// testOld(1,2,3,4);//無法使用此種方式呼叫
		testOld(new int[] { 1, 2, 3, 4 });// 需使用陣列方式呼叫
		System.out.println(a.repeat(30));
		// 呼叫變動參數的今生
		testNow(new int[] { 1, 2, 3, 4 });
		System.out.println(a.repeat(30));
		testNow();
		System.out.println(a.repeat(30));
		testNow(22, 33, 44, 55, 66);
		System.out.println(a.repeat(30));
		System.out.println(priority(1));

	}

	static void test() {
		System.out.println("無參數");
	}

	static void test(int a) {
		System.out.println("一個整數參數");
	}

	static void test(double a) {
		System.out.println("一個浮點數參數");
	}

	static void test(int a, double b) {
		System.out.println("兩個參數,前浮後整");
	}

	static void test(double a, int b) {
		System.out.println("兩個參數,前整後浮");
	}

	// 變動參數前世寫法
	static void testOld(int[] score) {
		for (int s : score) 
			System.out.print(s + "\t");
		System.out.println();
	}

	// 變動參數今生寫法 ...
	static void testNow(int... score) {// 變動參數必須為最後一個參數
		// System.out.println(score);//會印出hashCode
		for (int s : score) 
			System.out.print(s + "\t");
		System.out.println();
	}

	// 方法多載的優先順序
	// 先找相同型態>再找自動轉型>再找自動裝箱>最後才是變動參數
	static String priority(int a) {
		return "相同型態";
	}

	static String priority(double a) {
		return "自動轉型";
	}

	static String priority(Integer a) {
		return "自動裝箱";
	}

	static String priority(int... a) {
		return "變動參數";
	}
}

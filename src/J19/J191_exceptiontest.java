package J19;

import java.io.File;
import java.io.IOException;

public class J191_exceptiontest {

	public static void main(String[] args) {
		// unchecked Exception(編譯器不要求做檢查)
		// main(args);//java.lang.StackOverflowError
		// int[] a = new int[1024*1024*1024];//java.lang.OutOfMemoryError
		// Checked Exception(編譯器要求做檢查)
		File file = new File("a.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 有父子繼承關係
		String a = "pcschool";
		int[] b = new int[2];
		// a.charAt(20);//被JVM捕捉到下面所有程式中斷執行
		try {
			a.charAt(20);// 放在try-catch-finally程式不中斷
//			b[2] = 100;
//			System.out.println(10 / 0);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("字串錯誤");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("陣列錯誤");
		} catch (RuntimeException e) {
			System.out.println("其他錯誤");
		}
		System.out.println(a);

		// 無父子繼承關係
		try {
//			System.out.println(10 / 0);
			String c = null;
			c.concat("abc");
		} catch (ArithmeticException e) {
			System.out.println("數學運算錯誤 " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("空指標異常 " + e.getMessage());
			// e.getMessage();//錯誤訊息較簡略
			// e.printStackTrace();// 錯誤訊息較完整
		} finally {
			System.out.println("我一定會執行到的區塊");
		}

		int num = test();
		System.out.println(num);

		try {
			methodA();
		} catch (Exception e) {
			methodB();
			System.out.println(e.getMessage());
		}

	}

	public static int test() {
		try {
			int a[] = new int[5];
			System.out.println(a[5]);// 此行可註解掉看程式執行結果
			return 1;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("陣列超出索引值");
			return 2;// 被finally攔胡return 3
		} finally {
			System.out.println("我一定會執行");
			return 3;// 練習時可先將此行註解掉, 看其return1或return 2,但無論如何皆會執行到finally
		}
	}

	static void methodA() {
		try {
			System.out.println("進入方法\"A\"");
			throw new RuntimeException("方法\"A\"沒事拋出例外");
		} finally {
			System.out.println("用方法\"A\"的finally區段,且一定會執行到");
		}
	}

	static void methodB() {
		try {
			System.out.println("進入方法\"B\"");
			return;
		} finally {
			System.out.println("用方法\"B\"的finally區段,且一定會執行到");
		}
	}
}

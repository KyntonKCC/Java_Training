package J12;

public class J122_methodtest {
	/* private-->最自私,只有自己(同一類別)才可以存取 
	 * default-->同一個資料夾(package)才可存取,不同則無法存取
	 * protected-->原則上跟default一樣,但若是子類別,則不同package也可以存取 
	 * public-->最大愛,任何人皆可以存取
	 */
	public static void main(String[] args) {
		System.out.println("1+2+3+....+100=" + calSum(100));
		System.out.println("1+2+3+....+200=" + calSum(200));
		System.out.println("1+2+3+....+300=" + calSum(300));
		System.out.println("1+2+3+....+1000=" + new J122_TestClass().test());

	}

	// 宣告一個用來加總的方法--begin
	static int calSum(int max) {
		int sum = 0;
		for (int m = 1; m <= max; m++)
			sum += m;
		return sum;
	}
	// 宣告一個用來加總的方法--end
}

class J122_TestClass {
	int test() {
		return J122_methodtest.calSum(1000);
	}
}
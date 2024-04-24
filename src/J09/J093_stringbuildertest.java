package J09;

public class J093_stringbuildertest {

	public static void main(String[] args) {
		/* StringBuilder 
		 * 1.length()同String皆為取得字串長度 
		 * 2.capacity()為取得容量,預設為16,也可以利用建構子new StringBuilder(n)設定大小
		 */
		StringBuilder s1 = new StringBuilder();
		System.out.println(s1.length());// 0
		System.out.println(s1.capacity());// 16
		StringBuilder s2 = new StringBuilder(8);
		System.out.println(s2.length());// 0
		System.out.println(s2.capacity());// 8
		System.out.println("新增字串超過8個字的capacity為");
		s2.append("123456789");
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println(s2.capacity());
		// StringBuilder 沒有 equals 的方法
		StringBuilder s3 = new StringBuilder("java");
		StringBuilder s4 = new StringBuilder("java");
		System.out.println(s3.equals("java"));// false
		System.out.println(s3.toString().equals("java"));// true
		System.out.println(s3.equals(s4));// false
		System.out.println(s3.toString().equals(s4.toString()));// true

	}

}

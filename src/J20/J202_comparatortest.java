package J20;

import java.util.Arrays;
import java.util.Comparator;

@SuppressWarnings("all")
public class J202_comparatortest {

	public static void main(String[] args) {
		/* 比較器分類 
		 * 1.自然排序Comparable抽象方法為compareTo(T z)只有一個參數
		 * 2.自定排序Comparator抽象方法為compare(T z1,T z2)有兩個參數
		 */
		String color[] = { "mike", "amy", "zoe", "tom", "james" };
		// 預設由小到大
		Arrays.sort(color, 0, 3);// 只比較前三個
		System.out.println(Arrays.toString(color));
		
		// 利用匿名類別改寫排序準則
		Arrays.sort(color, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		// Lambda表達式
		Arrays.sort(color, (o1, o2) -> o2.compareTo(o1));
		System.out.println("=====由大到小排序====");
		System.out.println(Arrays.toString(color));

	}

}

package J25;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class J252_methodreference {

	public static void main(String[] args) {
		Comparator<Integer> com1 = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		};
		Comparator<Integer> com2 = (o1, o2) -> Integer.compare(o1, o2);// Lambda
		Comparator<Integer> com3 = Integer::compare;// 方法參照
		System.out.println(com1.compare(11, 11));
		System.out.println(com2.compare(11, 11));
		System.out.println(com3.compare(11, 11));

		List<String> names = Arrays.asList("Dog", "cat", "tiger", "animal", "Zoo");
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// 呼叫自訂的排序方法
				return J252_SortMethod.byLength(o1, o2);
			}
		});
		System.out.println(names.toString());
		Collections.sort(names, (o1, o2) -> J252_SortMethod.byAlphaOrder(o1, o2));// Lambda
		System.out.println(names.toString());
		Collections.sort(names, J252_SortMethod::byAlphaOrderIgnoreCase);// 方法參照
		System.out.println(names.toString());

	}

}

class J252_SortMethod {
	// 依字串長度排序
	static int byLength(String s1, String s2) {
		return s1.length() - s2.length();
	}

	// 依字母順序排序
	static int byAlphaOrder(String s1, String s2) {
		return s1.compareTo(s2);
	}

	// 依字母順序排序不分大小寫
	static int byAlphaOrderIgnoreCase(String s1, String s2) {
		return s1.compareToIgnoreCase(s2);
	}
}
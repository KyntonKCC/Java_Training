package J24;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class J243_collectionstest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(22, 33, 55, 11, 99, 34, 88, 66);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.shuffle(list);// shuffle( )隨機排序
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		// sort(list, Comparator)自訂排序
		Collections.sort(list, (o1, o2) -> Integer.compare(o2, o1));
		System.out.println(list);
		// swap(list,int ,int)指定集合中二元素交換位置
		Collections.swap(list, 1, 2);
		System.out.println(list);
		// frequency(Collection, Object)返回集合中指定元素出現的次數
		System.out.println(Collections.frequency(list, 34));
		// List dest = new ArrayList();//錯誤方式
		// size為0 //java.lang.IndexOutOfBoundsException
		List dest = Arrays.asList(new Object[list.size()]);
		Collections.copy(dest, list);
		System.out.println(dest);

	}

}

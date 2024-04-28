package J23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class J236_treesettest {

	public static void main(String[] args) {
		/* treeSet 自動排序
		 * subSet(start,end) 顯示集合中從多少到多少間的值 
		 * tailSet(n) 顯示大於等於n的所有值 
		 * headSet(n) 顯示小於n的所有值
		 */
		TreeSet<Integer> ts = new TreeSet<Integer>(/**(o1, o2) -> Integer.compare(o1, o2)*/);
		for (int i = 1; i <= 10; i++) {
			int r = (int) (Math.random() * 100) + 1;
			System.out.print(r + "\t");
			ts.add(r);
		}
		System.out.println();
		System.out.println("ts內元素的個數：" + ts.size());
		System.out.println("ts集合內容為：" + ts);
//		Iterator it = ts.iterator();
//		while (it.hasNext()) {
//			System.out.print(it.next() + "\t");
//		}
//		System.out.println();
		System.out.println("第一個元素為：" + ts.first());
		System.out.println("最後一個元素為：" + ts.last());
		ts.add(20);
		ts.add(60);
		System.out.println(ts);
		System.out.println("介於20到60之間的集合為：" + ts.subSet(20, 60));// 不包含60
		System.out.println("大於等於20的集合為：" + ts.tailSet(20));
		System.out.printf("大於等於20的集合共有%d個%n", ts.tailSet(20).size());
		System.out.println("小於60的集合為：" + ts.headSet(60)); // 不包含60
		System.out.printf("小於60的集合共有%d個%n", ts.headSet(60).size());

		// 集合中產生集合後 只能讀不能修改、寫入的四種方法
		// Collections.unmodifiableList() 還有 Set,Collection
		ArrayList<String> al = new ArrayList();
		al.add("mike");
		al.add("amy");
		al.add("Linda");
		List<String> unModify = Collections.unmodifiableList(al);
		// unModify.set(2, "ok");//add 及 remove 皆不行
		// Set.of() 或是 List.of() 方法
		List<String> of = List.of("mike", "amy", "jacky");
		// of.add("Linda");
		// Arrays.asList() 方法
		List<String> of2 = Arrays.asList("mike", "amy", "jacky");
		// of2.add("Linda");

		// Set.Copyof() 或是 List.Copyof() 方法
		// 若是來源是 new ArrayList() 則 copy 的目的與來源不是同一個物件,一個是可新增的,一個不可新增
		// 反之來源是 unmodifiable 則二個皆為不可新增的
		ArrayList ls1 = new ArrayList();
		ls1.add(1);
		ls1.add(2);
		ls1.add(3);
		List copy1 = List.copyOf(ls1);
		System.out.println(ls1 == copy1);// false
		ls1.add(4);
		// copy1.add(5);// 拋出 UnsupportedOperationException
		
		// 複製不可改變的集合
		List<Integer> ls2 = List.of(1, 2, 3, 4, 5);
		List<Integer> copy2 = List.copyOf(ls2);
		System.out.println(ls2 == copy2);// true
		// ls2.add(7);// 拋出 UnsupportedOperationException
		// copy2.add(8);// 拋出 UnsupportedOperationException

	}

}

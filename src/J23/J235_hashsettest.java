package J23;

import java.util.HashSet;
import java.util.Iterator;

public class J235_hashsettest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		String str1 = "Dog";
		String str2 = "Cat";
		System.out.println("HashSet hs 是否為空值：" + (hs.isEmpty() ? "是" : "否"));// 是
		hs.add("Monkey");
		hs.add("Tiger");
		hs.add(str1);
		hs.add(str2);
		System.out.printf("HashSet hs 的元素共有:%d個%n", hs.size());// 4
		System.out.println("HashSet hs 是否為空值：" + (hs.isEmpty() ? "是" : "否"));// 否
		System.out.println("HashSet hs 的內容為：" + hs);
		// 利用Iterator的集合走訪器印出集合內容
		Iterator it = hs.iterator();
		String s = null;
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();
		hs.remove(str2);
		System.out.printf("清除str 2後HashSet hs 的元素共有: %d 個%n", hs.size());// 3
		System.out.println("HashSet hs 的內容為：" + hs);
		System.out.println("HashSet hs 是否有包含str2：" + (hs.contains(str2) ? "是" : "否"));// 否
		System.out.println("HashSet hs 是否有包含Dog：" + (hs.contains("Dog") ? "是" : "否"));// 是
		System.out.println("HashSet hs 是否有包含str1：" + (hs.contains(str1) ? "是" : "否"));// 是
		hs.remove("Dog");
		System.out.println("HashSet hs 的內容為：" + hs);

	}

}

package J23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class J231_iteratortest {

	public static void main(String[] args) {
		// 用途在於巡訪集合中所有元素
		// 利用Collection的iterator方法返回Iterator
		// 介面的實例
		Collection col = new ArrayList();
		col.add(123);
		col.add(true);
		col.add(new String("java"));
		col.add(new J231_Person("amy", 25));

		Iterator it = col.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		// System.out.println(it.next());//NoSuchElementsException
		it = col.iterator();// 需重新再指定一次,因為上一個巡訪器已到底端
		for (int m = 0; m < col.size(); m++) {
			System.out.println(it.next());
		}
		it = col.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 二種使用疊代器錯誤的用法
		// 方法一,會產生NoSuchElementException,且會跳著印會印2,4
		// it = col.iterator();
		// while (it.next() != null) {
		// System.out.println(it.next());
		// }
		// 方法二,要先註解上方的程式碼才可測試
		// 會產生無限循環，只印第一個元素,因為是二個不同的it
		// while (col.iterator().hasNext()) {
		// System.out.println(col.iterator().next());
		// }

		System.out.println(col);
		it = col.iterator();
		while (it.hasNext()) {
			// col.add("5");//java.util.ConcurrentModificationException
			if (it.next() == Integer.valueOf(123)) {
				it.remove();
			}
		}
		System.out.println(col);

	}

}

class J231_Person {
	String name;
	int age;

	J231_Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

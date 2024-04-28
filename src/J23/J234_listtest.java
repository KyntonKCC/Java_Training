package J23;

import java.util.LinkedList;

public class J234_listtest {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		for (int i = 1; i <= 5; i++) 
			li.add(i);
		li.addFirst(100);
		li.addLast(900);
		li.addFirst(50);
		li.add(3, 88);
		li.add(900);
		System.out.println(li);
		System.out.println("取得第三個位置的元素：" + li.get(2));
		System.out.println("傳回5在集合中第一次出現的位置為：" + li.indexOf(5));
		System.out.println("刪除最後一個元素：" + li.removeLast() + ".....");
		System.out.println(li);
		System.out.println("第一個元素為：" + li.getFirst());
		System.out.println("最後一個元素為：" + li.getLast());

	}

}

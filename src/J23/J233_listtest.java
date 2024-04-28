package J23;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class J233_listtest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(111);
		list.add(222);
		list.add(333);
		list.add("456");
		list.add(new Date());
		System.out.println(list);
		list.add(1, 1515);// 插入在索引編號為1的位置,即222往下移
		System.out.println(list);
		// 取得某索引值的內容get(index)
		System.out.println(list.get(1));// 1515
		// 查詢某元素位於集合中第幾個位置,有找到回傳索引值,沒找到回傳-1
		System.out.println(list.indexOf(1515));// 1
		System.out.println(list.indexOf(1818));// -1
		list.add(1515);// 加到最後,但移除從前面
		System.out.println(list);
		System.out.println(list.lastIndexOf(1515));// 6
		// list.remove(1515);//元素名稱,此行會發生異常,索引超出範圍,要以物件方式刪除new Integer(“1515”);
		list.remove(6);// 索引編號
		System.out.println(list);
		// set(index,元素)更改元素內容
		list.set(3, "hello");// 將索引編號為3的內容改為hello
		System.out.println(list);
		List subList = list.subList(2, 5);// 取得begin 到end-1的元素
		System.out.println(subList);// [222,hello, 456]

	}

}

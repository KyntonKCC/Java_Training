package J24;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class J246_generictest {
	public static void main(String[] args) {
		// 有限制條件的萬用字元
		// <? extends Class> 小於等於類別 (-oo,類別]
		// <? super Class> 大於等於類別 [類別,oo)
		List<? extends J246_Father> list1 = null;
		List<? super J246_Father> list2 = null;
		List<J246_Father> list3 = null;
		List<J246_Son> list4 = null;
		List<Object> list5 = null;
		// 賦值 ? extends Father
		list1 = list3;
		list1 = list4;
		// list1 = list5;
		// 賦值 ? super Father
		list2 = list3;
		// list2 = list4;
		list2 = list5;
		// Object > Number > Integer, Float, Double, Short, Long, Byte
		List<? super Short> ls1 = new ArrayList<Number>();
		List<? extends Number> ls2 = new ArrayList<Integer>();
		List<? extends Number> ls3 = new ArrayList<Byte>();
		List<? super Number> ls4 = new ArrayList<Object>();

	}

}

class J246_Father {
}

class J246_Son extends J246_Father {
}
package J24;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class J241_maptest {

	public static void main(String[] args) {
		HashMap map1 = new HashMap();// 順序為 HashCode
		map1.put("A", "SCJP");
		map1.put("B", 100);
		map1.put(200, 2000);
		map1.put(new Object(), "SCBCD");
		map1.put(null, null);
		map1.put("B", "HELLO");// 此為修改
		System.out.println(map1);
		System.out.println("Key A = " + map1.get("A"));// SCJP
		System.out.println("Key 200 = " + map1.get(200));// 2000
		System.out.println("Key C = " + map1.get("C"));// 若沒有KEY值,則VALUE為NULL
		// 利用 for each 巡訪 map
		for (Object x : map1.keySet()) {
			System.out.println(x + " = " + map1.get(x));
		}

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(10001, "WORD");
		map2.put(10002, "EXCEL");
		map2.put(10004, "POWERPOINT");
		map2.put(10008, "ACCESS");
		map2.put(10005, "EXCEL");
		System.out.println("map的元素個數有：" + map2.size() + "個");
		System.out.println("map的元素如下：");
		System.out.println(map2);
		System.out.println("map中是否有10002的Key值：" + (map2.containsKey(10002) ? "是" : "否"));
		System.out.println("map中是否有Access的value值：" + (map2.containsValue("Access") ? "是" : "否"));
		System.out.println("map中是否有ACCESS的value值：" + (map2.containsValue("ACCESS") ? "是" : "否"));
		System.out.println("印出map中所有key值：" + map2.keySet());
		System.out.println("印出map中所有value值：" + map2.values());
		System.out.println("清除關鍵值為10002的對應值" + map2.remove(10002));
		System.out.println(map2);
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(111, "111");
		map3.put(222, "222");
		map2.putAll(map3);
		System.out.println(map2);

		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(10004, "POWERPOINT");
		map4.put(10001, "WORD");
		map4.put(10008, "ACCESS");
		map4.put(10002, "EXCEL");
		map4.put(10005, "EXCEL2020");
		// 巡訪所有key值
		System.out.println("=====巡訪所有key值========");
		Set<Integer> keySet = map4.keySet();
		Iterator<Integer> iterator1 = keySet.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		System.out.println("=====巡訪所有value值========");
		Collection<String> values = map4.values();
		Iterator<String> iterator2 = values.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		System.out.println("=====巡訪所有key-value值========");
		Set<Map.Entry<Integer, String>> entrySet = map4.entrySet();// 巢狀泛型
		Iterator<Map.Entry<Integer, String>> iterator3 = entrySet.iterator();
		while (iterator3.hasNext()) {
			Object obj = iterator3.next();
			Map.Entry entry = (Map.Entry) obj;
			System.out.print(entry.getKey());
			System.out.print(" 對應到 ");
			System.out.print(entry.getValue());
			System.out.println();
		}

	}

}

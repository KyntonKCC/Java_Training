package J24;

import java.util.Set;
import java.util.TreeMap;

public class J242_treemaptest {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(10002, "EXCEL");
		map.put(10004, "POWERPOINT");
		map.put(10008, "ACCESS");
		map.put(10001, "WORD");
		map.put(10005, "EXCEL");
		System.out.println("map的第一個元素是：" + map.get(map.firstKey()));
		System.out.println("map的最後一個元素是：" + map.get(map.lastKey()));
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		System.out.println("map中從10002到10005的元素有" + map.subMap(10002, 10005));// 不包含1005
		System.out.println("map的元素個數有：" + map.size() + "個");
		System.out.println("map的元素如下：");
		System.out.println(map);
		System.out.println("map中是否有10002的Key值：" + (map.containsKey(10002) ? "是" : "否"));
		System.out.println("map中是否有10002的Key值：" + (map.containsValue("Access") ? "是" : "否"));
		System.out.println("map中是否有10002的Key值：" + (map.containsValue("ACCESS") ? "是" : "否"));
		System.out.println("印出map中所有key值：" + map.keySet());
		System.out.println("印出map中所有value值：" + map.values());
		System.out.println("清除關鍵值為10002的對應值" + map.remove(10002));
		System.out.println(map);

	}

}

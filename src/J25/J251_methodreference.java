package J25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class J251_methodreference {

	public static void main(String[] args) {
		J251_Pet micky = () -> System.out.println("我是Lambda的老鼠,我會跑");
		micky.run();

		System.out.println("===========傳統============");
		Consumer<String> con = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		con.accept("我是傳統消費類");
		System.out.println("===========Lambda==========");
		Consumer<String> con1 = (String t) -> System.out.println(t);
		Consumer<String> con2 = t -> System.out.println(t);// 類型推斷
		con2.accept("大家好Lambda表達式");
		System.out.println("========使用方法參照========");
		Consumer<String> con3 = System.out::println;
		con3.accept("大家好方法參照");

		System.out.println("========使用匿名類別========");
		Comparator<Integer> com = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		};
		System.out.println(com.compare(20, 20));
		System.out.println("===========Lambda==========");
		Comparator<Integer> com1 = (o1, o2) -> Integer.compare(o1, o2);
		System.out.println(com1.compare(21, 20));

		System.out.println("===========傳統============");
		shopping(500, new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println("消費金額為" + t);
			}
		});
		System.out.println("===========Lambda==========");
		shopping(800, t -> System.out.println("消費金額為" + t));

		System.out.println("========使用匿名類別========");
		Function<Double, Long> fun = new Function<Double, Long>() {
			@Override
			public Long apply(Double t) {
				return Math.round(t);
			}
		};
		System.out.println(fun.apply(5.3));
		System.out.println("===========Lambda==========");
		Function<Double, Long> fun2 = t -> Math.round(t);
		System.out.println(fun2.apply(5.6));
		System.out.println("========使用方法參照========");
		Function<Double, Long> fun3 = Math::round;
		System.out.println(fun3.apply(5.2));

		System.out.println("===========傳統============");
		List<String> list = Arrays.asList("Arica", "Andy", "Aric", "Cindy", "Candy");
		List<String> filterStr = filterString(list, new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.startsWith("A");
			}
		});
		System.out.println(filterStr);
		System.out.println("===========Lambda==========");
		List<String> filterStr1 = filterString(list, t -> t.startsWith("C"));
		System.out.println(filterStr1);

	}

	public static void shopping(int money, Consumer<Integer> con) {
		con.accept(money);
	}

	// 依據給定的規則,篩選集合中的字串,此規則由Predicate的方法決定,此方法先定義
	public static List<String> filterString(List<String> list, Predicate<String> pre) {
		ArrayList<String> filterList = new ArrayList();
		for (String s : list) {
			if (pre.test(s)) {
				filterList.add(s);
			}
		}
		return filterList;
	}
}

interface J251_Pet {
	void run();
}

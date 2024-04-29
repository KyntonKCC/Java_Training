package J24;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class J247_lambdatest {

	public static void main(String[] args) {
		/* Lambda 表達式的六種語法 
		 * 1.方法簽章小括號內有幾種狀態 
		 *  a.() 
		 *  b.(int a),也可以精簡成 (a) ,因為變數只有一個可在精簡成 a
		 *  c.(int a,int b),也可以精簡成 (a,b)
		 * 2.方法 body 部分有下列幾種狀態 
		 *  a.只有一行敘述,沒回傳,可以省略大括號
		 *  b.只有一行敘述,有return,可以將大括號及return省略,切記{}大括號及return相依為命,要麼都出現,要麼都省略,不能單獨出現
		 *  c.有多行敘述,不管有無return,沒有return,只有單一結果,甚麼都不能省略
		 */

		Supplier<Integer> sup1 = new Supplier<Integer>() {
			@Override
			public Integer get() {
				return 100;
			}
		};
		Supplier<Integer> sup2 = () -> {
			return 110;
		};
		Supplier<Integer> sup3 = () -> 120;
		System.out.println(sup1.get());
		System.out.println(sup2.get());
		System.out.println(sup3.get());

		Consumer<Integer> con1 = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		Consumer<Integer> con2 = (Integer t) -> {
			System.out.println(t);
		};
		Consumer<Integer> con3 = (t) -> {
			System.out.println(t);
		};
		Consumer<Integer> con4 = t -> {
			System.out.println(t);
		};
		Consumer<Integer> con5 = t -> System.out.println(t);
		con1.accept(100);
		con2.accept(110);
		con3.accept(120);
		con4.accept(130);
		con5.accept(140);

		Function<String, Integer> fun1 = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return Integer.parseInt(t);
			}
		};
		Function<String, Integer> fun2 = (String t) -> {
			return Integer.parseInt(t);
		};
		Function<String, Integer> fun3 = t -> Integer.parseInt(t);
		System.out.println(fun1.apply("100") + 100);
		System.out.println(fun2.apply("200") + 200);
		System.out.println(fun3.apply("300") + 300);

		Comparator<Integer> com1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		};
		Comparator<Integer> com2 = (Integer o1, Integer o2) -> {
			return o1 - o2;
		};
		Comparator<Integer> com3 = (o1, o2) -> o1 - o2;
		System.out.println(com1.compare(90, 100));
		System.out.println(com2.compare(80, 100));
		System.out.println(com3.compare(70, 100));

	}
	/*
	 * 宣告方法
	 * 
	 * 回傳型態 方法名稱(形式參數) {
	 * 
	 * return 資料型態物件 }
	 * 
	 */
}

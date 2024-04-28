package J23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class J232_iteratortest {

	public static void main(String[] args) {
		/* 四大函數式介面 
		 * 1.Consumer 消費型 抽象方法 void accept(T a) 
		 * 2.Supplier 供給型 抽象方法 T get()
		 * 3.Function 功能型 抽象方法 R apply(T a) 
		 * 4.Predicate 判斷型 抽象方法 boolean test(T a)
		 */
		Collection<Integer> col1 = new ArrayList<Integer>();
		col1.add(123);
		col1.add(456);
		col1.add(789);
		// 利用 forEach 方法來巡訪集合內容
		// 2.產生實作介面類別的物件
		J232_Fun f = new J232_Fun();
		col1.forEach(f);
		System.out.println();
		// 以匿名類別方式來實作 Consumer 介面
		col1.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		// Lambda表達式,前提是函數式介面@FunctionalInterface
		System.out.println("======Lambda表達式======");
		col1.forEach(t -> System.out.println(t));
		// Method Reference方法參照
		System.out.println("======Method Reference方法參照======");
		col1.forEach(System.out::println);

	}

}

//1.宣告類別來實作介面
class J232_Fun implements Consumer<Integer> {
	@Override
	public void accept(Integer t) {
		System.out.print(t + "::");
	}
}
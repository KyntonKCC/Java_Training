package J25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class J254_streamtest {

	public static void main(String[] args) {
		// 透過集合
		List<String> list0 = Arrays.asList("mike", "amy", "linda", "jackson", "kenny");
		Stream<String> stream0;
		stream0 = list0.stream();
		stream0.forEach(t -> System.out.println(t));// Lamdba
		System.out.println("=============================");
		stream0 = list0.stream();
		stream0.forEach(System.out::println); // 方法參照
		System.out.println("=============================");

		// 透過陣列
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		IntStream stream1 = Arrays.stream(arr);
		stream1.forEach(System.out::println);
		System.out.println("=============================");
		double[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		DoubleStream stream2 = Arrays.stream(arr1);
		stream2.forEach(System.out::println);
		System.out.println("=============================");

		// 透過Stream的of( )方法
		Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
		stream3.forEach(System.out::println);
		System.out.println("=============================");

		// 無限串流
		// 透過巡訪器
		Stream.iterate(0, t -> t + 2).limit(11).forEach(System.out::println);
		System.out.println("=============================");
		// 透過產生器
		Stream.generate(Math::random).limit(11).forEach(System.out::println);
		System.out.println("=============================");

		// 中間操作 Filter Limit Skip distinct
		String str[] = { "mike", "amy", "tom", "jimmy", "linda", "jason", "james", "james", "linda" };
		Stream<String> stream;
		stream = Arrays.stream(str);
		stream.filter(s -> s.contains("i")).forEach(System.out::println);
		System.out.println("=============================");
		stream = Arrays.stream(str);
		stream.filter(s -> s.contains("i")).limit(3).forEach(System.out::println);
		System.out.println("=============================");
		stream = Arrays.stream(str);
		stream.filter(s -> s.contains("i")).skip(1).forEach(System.out::println);
		System.out.println("=============================");
		stream = Arrays.stream(str);
		stream.distinct().forEach(System.out::println);
		System.out.println("=============================");

		// 中間操作 map flatMap
		List<String> list1 = Arrays.asList("mike", "amy", "linda", "jackson", "kenny", "linda");
		list1.stream().map(s -> s.toUpperCase()).forEach(s -> {
			System.out.print(s + "\t");
		});
		System.out.println("\n====印出長度超過4個字的姓名,並轉成大寫========");
		list1.stream().distinct().filter(s -> s.length() > 4).map(s -> s.toUpperCase()).forEach(System.out::println);
		System.out.println("=============================");

		List<String> list2 = Arrays.asList("mike", "amy", "linda", "jackson", "kenny");
		// 方法參照 類別::靜態方法
		Stream<Stream<Character>> result = list2.stream().map(J254_streamtest::fromStringToStream);
		// result.forEach(System.out::println)印出物件,此時result還是Stream物件
		result.forEach(s -> {
			s.forEach(System.out::println);
		});
		System.out.println("=============================");
		// 利用flatMap
		Stream<Character> flatMap = list2.stream().flatMap(J254_streamtest::fromStringToStream);
		flatMap.forEach(System.out::println);

	}

	public static Stream<Character> fromStringToStream(String str) {
		ArrayList<Character> list = new ArrayList<>();
		for (Character c : str.toCharArray()) {
			list.add(c);
		}
		return list.stream();
	}
}

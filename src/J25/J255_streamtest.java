package J25;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class J255_streamtest {

	public static void main(String[] args) {
		// 中間操作 sorted
		List<Integer> list0 = Arrays.asList(11, 55, 23, 66, 33, 21, 99, 10, 8, 56);
		list0.stream().sorted().forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		list0.stream().sorted((o1, o2) -> Integer.compare(o2, o1)).forEach(s -> System.out.print(s + "\t"));
		System.out.println();

		// 中間操作 peek,若沒有終止操作是不會有輸出的,其將結果變成一個新的流,如下範例
		Stream<Integer> peek = Stream.of(10, 20, 30).peek(System.out::println);
		peek.collect(Collectors.toList());
		List<Integer> collect = Stream.of(50, 11, 1, 13).peek(e -> System.out.println("peek值:" + e))
				// .sorted()
				.peek(System.out::println).collect(Collectors.toList());
		System.out.println(collect);
		// 對於count終止操作無作用

		// 終止操作 allMatch anyMatch noneMatch findFirst findAny
		List<Integer> list = Arrays.asList(11, 55, 23, 66, 33, 21, 99, 10, 8, 56);
		System.out.println("=========皆小於50======");
		boolean allMatch = list.stream().allMatch(s -> s < 50);
		System.out.println(allMatch);
		System.out.println("=========只要有小於50======");
		boolean anyMatch = list.stream().anyMatch(s -> s < 50);
		System.out.println(anyMatch);
		System.out.println("=========沒有小於50======");
		boolean noneMatch = list.stream().noneMatch(s -> s < 50);
		System.out.println(noneMatch);
		System.out.println("=========找到第一個元素======");
		Optional<Integer> findFirst = list.stream().findFirst();
		System.out.println(findFirst.get());
		System.out.println("=========回傳串流中數目的總數======");
		long count = list.stream().filter(s -> s >= 50).count();
		System.out.println(count);
		System.out.println("=========回傳串流中最大值======");
		Optional<Integer> max = list.stream().max(Integer::compare);
		System.out.println(max.get());
		System.out.println("=========回傳串流中最小值======");
		Optional<Integer> min = list.stream().min(Integer::compare);
		System.out.println(min.get());

		// 終止操作 reduce collect
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("============總結================");
		Integer reduce = list1.stream().reduce(0, (t1, t2) -> Integer.sum(t1, t2));
		System.out.println(reduce);
		System.out.println("============收集================");
		List<Integer> list2 = list1.stream().filter(t -> t >= 5).collect(Collectors.toList());
		list2.forEach(System.out::println);
		Set<Integer> set = list1.stream().filter(t -> t >= 5).collect(Collectors.toSet());
		set.forEach(System.out::println);

	}

}

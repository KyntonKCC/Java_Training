package J22;

import java.util.Arrays;
import java.util.Optional;

public class J224_optionaltest {

	public static void main(String[] args) {
		J224_Boy jacky = null;
		J224_Boy james = new J224_Boy();
		
		// 調用 of 方法,必須非 null
		// Optional<J224_Boy> of1 = Optional.of(jacky);
		// System.out.println(of1);
		Optional<J224_Boy> of2 = Optional.of(james);
		System.out.println(of2);
		
		// 調用 ofNullable 方法,可以為 null
		Optional<J224_Boy> of3 = Optional.ofNullable(jacky);
		System.out.println(of3);
		Optional<J224_Boy> of4 = Optional.ofNullable(james);
		System.out.println(of4);
		
		// 調用 orElse 方法,若不為 null 回傳原物件,若為 null 則回傳another t
		Optional of5 = Optional.ofNullable(jacky);
		Object result1 = of5.orElse(new J224_Girl());
		System.out.println(result1);
		Optional of6 = Optional.ofNullable(james);
		Object result2 = of6.orElse(new J224_Girl());
		System.out.println(result2);
		
		// 調用 get 方法,回傳 Optional 所包原物件值,而不是 Optional 物件
		Integer a[] = { 1, 2, 3, 4, 5 };
		Optional<Integer[]> of7 = Optional.of(a);
		Integer[] integers = of7.get();
		System.out.println(Arrays.toString(integers));
		
		// 調用 empty 方法
		Optional of8 = Optional.empty();
		System.out.println(of8);
		// System.out.println(of8.get());//java.util.NoSuchElementException

		// System.out.println("Ans :" + convert("a").get());//java.util.NoSuchElementException
		System.out.println("Ans : " + convert("120").get());
		System.out.println("Ans : " + convert("120"));

	}

	private static Optional<Integer> convert(String a) {
		try {
			return Optional.ofNullable(Integer.parseInt(a));
		} catch (Exception e) {
			return Optional.empty();
		}
	}
}

class J224_Boy {
	int age = 15;

	@Override
	public String toString() {
		return "Boy [age=" + age + "歲]";
	}
}

class J224_Girl {
	int age = 18;

	@Override
	public String toString() {
		return "Girl [age=" + age + "歲]";
	}
}
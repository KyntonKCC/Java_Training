package J25;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class J253_methodreference {

	public static void main(String[] args) {
		J253_Person p = new J253_Person("Mike");
		Supplier<String> sup1 = new Supplier<String>() {// 匿名類別
			@Override
			public String get() {
				return p.getName();
			}
		};
		System.out.println(sup1.get());
		Supplier<String> sup2 = () -> p.getName();// Lambda
		System.out.println(sup2.get());
		Supplier<String> sup3 = p::getName;// 方法參照
		System.out.println(sup3.get());

		List<J253_Student1> student = Arrays.asList(new J253_Student1(1, "mike", 30), new J253_Student1(2, "amy", 15),
				new J253_Student1(3, "james", 55));
		J253_StudentSortMethod ssm = new J253_StudentSortMethod();
		System.out.println("====使用Lamda語法，依姓名排序========");
		Collections.sort(student, (a, b) -> ssm.byName(a, b));// Lambda
		System.out.println(student.toString());
		System.out.println("====使用方法參照語法，依年齡排序========");
		Collections.sort(student, ssm::byAge);// 方法參照
		System.out.println(student.toString());

		Comparator<String> com1 = new Comparator<String>() {// 匿名類別
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println(com1.compare("java", "Java"));
		Comparator<String> com2 = (o1, o2) -> o1.compareTo(o2);// Lambda
		System.out.println(com2.compare("java", "Java"));
		Comparator<String> com3 = String::compareTo;// 方法參照
		System.out.println(com3.compare("java", "Java"));

		System.out.println("===========沒有參數的建構子參照=============");
		Supplier<J253_Student2> s = new Supplier<>() {// 匿名類別
			@Override
			public J253_Student2 get() {
				return new J253_Student2();
			}
		};
		s.get();
		Supplier<J253_Student2> s1 = () -> new J253_Student2();// Lambda
		s1.get();
		Supplier<J253_Student2> s2 = J253_Student2::new;// 方法參照
		s2.get();
		System.out.println("==========有一個參數的建構子參照=============");
		Function<String, J253_Student2> s3 = st -> new J253_Student2(st);// Lambda
		s3.apply("mike");
		Function<String, J253_Student2> s4 = J253_Student2::new;// 方法參照
		s4.apply("jacky");
		System.out.println("==========有二個參數的建構子參照=============");
		BiFunction<String, Integer, J253_Student2> s5 = (x, y) -> new J253_Student2(x, y);// Lambda
		s5.apply("mike", 25);
		BiFunction<String, Integer, J253_Student2> s6 = J253_Student2::new;// 方法參照
		s6.apply("linda", 35);

	}

}

class J253_Person {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public J253_Person(String name) {
		this.name = name;
	}
}

//宣告類別
class J253_Student1 {
	int id = 0;
	String name = null;
	int age = 0;

	public J253_Student1(int id, String name, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	@Override
	public String toString() {
		String str = String.format("學號：%d 姓名：%s 年齡：%d ", id, name, age);
		return str;
	}
}

//用來排序的類別
class J253_StudentSortMethod {
	// 依姓名排序
	public int byName(J253_Student1 s1, J253_Student1 s2) {
		return s1.name.compareTo(s2.name);
	}

	// 依年齡排序
	public int byAge(J253_Student1 s1, J253_Student1 s2) {
		return s1.age - s2.age;
	}
}

//宣告類別
class J253_Student2 {
	String name;
	int age;

	J253_Student2() {
		System.out.println("沒有參數的建構子");
	}

	J253_Student2(String name) {
		this.name = name;
		System.out.println("有一個參數的建構子A");
		System.out.println(toString());
	}

	J253_Student2(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("有二個參數的建構子A,B");
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Student [姓名=" + name + ", 年齡=" + age + "]";
	}
}
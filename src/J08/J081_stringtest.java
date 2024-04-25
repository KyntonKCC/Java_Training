package J08;

import java.util.Objects;

public class J081_stringtest {

	public static void main(String[] args) {
		J081_Person p1 = new J081_Person();
		J081_Person p2 = new J081_Person();
		J081_Person p3 = new J081_Person();
		p1.name = "amy";
		p1.age = 25;
		p2.name = "amy";
		p2.age = 25;
		p3.name = "may";
		p3.age = 30;
		System.out.println(p1 == p2);// false
		System.out.println(p1.equals(p2));// false//Override -> true

		/* 在建構字串物件,大部分我們都用字面值直接指定來建構 
		 * ,除非特出需求才會使用標準物件建構方式來建構字串
		 */
		String a = new String("java");
		String b = new String("java");
		System.out.println(a == b);// false//判斷stack
		System.out.println(a.equals(b));// true//判斷heap
		System.out.println("=======使用字面值宣告字串=======");
		String c = "java";
		String d = "java";
		// 都建立在String Pool
		System.out.println(c == d);// true
		System.out.println(c.equals(d));// true

		// 說明String immutable不可改變
		String e = new String("hello");
		e.concat(" java");// 額外產生一個新的記憶體空間//舊資料Garbage Collection
		System.out.println(e);// hello
		e = e.concat(" good");
		System.out.println(e);// hello good
		// 驗證StringBuilder mutable可改變
		StringBuilder f = new StringBuilder("happy");
		f.append(" java");
		System.out.println(f);// happy java

	}

}

class J081_Person {
	String name;
	int age;
	void test() {
		System.out.println("這是人類類別的test方法");
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		J081_Person other = (J081_Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
}
package J22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

@SuppressWarnings("all")
public class J225_collectiontest {

	public static void main(String[] args) {
		List ls1 = new ArrayList();
		ls1.add(123);
		ls1.add("java");
		ls1.add(new Date());
		ls1.add(123.456);
		ls1.add(123);
		System.out.println(ls1);
		List ls2 = new ArrayList();
		ls2.add(111);
		ls2.add("program");
		ls2.add(222.456);
		ls1.add(ls2);// 丟整個集合
		System.out.println(ls1);
		System.out.println(ls1.size());// 6
		ls1.addAll(ls2);// addAll會將集合拆開再加入
		System.out.println(ls1);
		System.out.println(ls1.size());// 9
		System.out.println(ls1.contains(123.456));// true
		System.out.println(ls1.contains("123.456"));// false
		ls2.add(111);
		System.out.println(ls2);
		System.out.println(ls1.containsAll(ls2));// true
		// 移除以物件表示,而不是索引值
		System.out.println(ls2.remove(0));
		System.out.println(ls2.remove("program"));
		System.out.println(ls2);
		// 移除二集合相同之元素
		ls1.removeAll(ls2);
		System.out.println(ls1);
		List ls3 = new ArrayList();
		ls3.add(123);
		ls3.add("java");
		// 保留二集合相同之元素
		ls1.retainAll(ls3);
		System.out.println(ls1);
		ls1.clear();
		System.out.println(ls1.isEmpty());// true

		List ls4 = new ArrayList();
		ls4.add(123);
		ls4.add(true);
		ls4.add(new String("java"));
		ls4.add(new J225_Person("amy", 25));
		System.out.println(ls4.contains("java"));// true
		System.out.println(ls4.contains(new J225_Person("amy", 25)));// true->hashCode

		Collection col2 = new ArrayList();
		col2.add(123);
		col2.add(456);
		col2.add(789);
		Collection col3 = new ArrayList();
		col3.add(456);
		col3.add(123);
		col3.add(789);
		System.out.println(col2.equals(col3));// false List為有序的
		Collection col4 = new HashSet();
		col4.add(123);
		col4.add(456);
		col4.add(789);
		Collection col5 = new HashSet();
		col5.add(456);
		col5.add(123);
		col5.add(789);
		System.out.println(col4.equals(col5));// true HashSet為無序的

		System.out.println("======集合轉陣列======");
		Collection col6 = new ArrayList();
		col6.add(123);
		col6.add(true);
		col6.add(new String("java"));
		col6.add(new J225_Person("amy", 25));
		Object obj[] = col6.toArray();
		for (Object x : obj) {
			System.out.println(x);
		}
		System.out.println("======陣列轉集合======");
		List col7 = Arrays.asList(new String[] { "java", "oca", "ocp" });
		// col7.add("819");// java.lang.UnsupportedOperationException
		// asList 是 fixed-size 不可以 add
		System.out.println(col7);
		Collection col8 = Arrays.asList(new int[] { 11, 22, 33 });// 需注意
		System.out.println(col8);
		Collection col9 = Arrays.asList(new Integer[] { 11, 22, 33 });
		System.out.println(col9);

	}

}

class J225_Person {
	String name;
	int age;

	public J225_Person() {
	}

	public J225_Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" + "姓名=" + name + ", 年齡=" + age + '}';
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
		J225_Person other = (J225_Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
}

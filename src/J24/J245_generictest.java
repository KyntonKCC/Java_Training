package J24;

import java.util.ArrayList;
import java.util.List;

public class J245_generictest {

	public static void main(String[] args) {
		J245_Person p1 = new J245_Person();
		p1.setSexT("Boy");
		p1.setSexT(false);
		J245_Person<String> p2 = new J245_Person();
		p2.setSexT("Girl");
		// p2.setSexT(false);

		Object a = null;
		String b = null;
		a = b;// 多型
		List<Object> c = null;
		List<String> d = null;
		// c = d;// 泛型並列關係但資料型態不同不可以相互賦值//Type mismatch
		// 解決方法如下
		List<?> list = null;
		list = c;
		list = d;
		// 萬用字元無法添加元素,但可以取值
		List<String> ls = new ArrayList<>();
		ls.add("hello");
		ls.add("kitty");
		list = ls;
		// list.add("?");
		// list.add(new Object());
		System.out.println(list.get(0));

	}

}

class J245_Person<T> {
	int age;
	String name;
	T sexT;

	public J245_Person() {
	}

	public J245_Person(String name, int age, T sexT) {
		this.name = name;
		this.age = age;
		this.sexT = sexT;
	}

	public void setSexT(T sexT) {
		this.sexT = sexT;
	}

	public T getSexT() {
		return sexT;
	}

	@Override
	public String toString() {
		return "Person{" + "age=" + age + ", name=" + name + ",sexT=" + sexT + '}';
	}

	// 泛型方法,跟上面的類別泛型無關
	public <E> List<E> arrayToList(E[] arr) {
		ArrayList<E> ls = new ArrayList<>();
		for (E x : arr)
			ls.add(x);
		return ls;
	}
}
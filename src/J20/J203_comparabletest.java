package J20;

import java.util.Arrays;

public class J203_comparabletest {

	public static void main(String[] args) {
		J203_Person person[] = new J203_Person[5];
		person[0] = new J203_Person("amy", 25);
		person[1] = new J203_Person("mike", 15);
		person[2] = new J203_Person("zoe", 35);
		person[3] = new J203_Person("james", 15);
		person[4] = new J203_Person("Tina", 18);
		Arrays.sort(person);
		System.out.println(Arrays.toString(person));

	}

}

class J203_Person implements Comparable<J203_Person> {
	String name;
	int age;

	public J203_Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[姓名=" + name + ", 年齡=" + age + "]";
	}

	@Override
	public int compareTo(J203_Person o) {
		int result = Integer.compare(o.age, this.age);
		if (result == 0)
			return o.name.compareTo(this.name);
		return result;
	}
}
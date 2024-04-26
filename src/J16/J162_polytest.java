package J16;

public class J162_polytest {

	public static void main(String[] args) {
		J162_Person p = new J162_Person();
		J162_Student s = new J162_Student();
		J162_Master m = new J162_Master();
		method(p);// Person e = new J162_Person()
		System.out.println();
		method(s);// Person e = new J162_Student()
		System.out.println();
		method(m);// Person e = new J162_Master()
		System.out.println();
		J162_Father f = new J162_Son();
		f.sum(1, 2, 3);

	}

	public static void method(J162_Person e) {
		e.getInfo();
		if (e instanceof J162_Person) {
			System.out.println("是人類");
		}
		if (e instanceof J162_Student) {
			System.out.println("是學生");
		}
		if (e instanceof J162_Master) {
			System.out.println("是研究生");
		}
	}
}

class J162_Person {
	protected String name = "Person";
	protected int age = 25;

	public void getInfo() {
		System.out.println("姓名:" + name + "\n年齡:" + age);
	}
}

class J162_Student extends J162_Person {
	protected String school = "NCKU";

	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("學校名稱:" + school);
	}
}

class J162_Master extends J162_Student {
	public String major = "CSIE";

	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("主修課程:" + major);
	}
}

class J162_Father {
	void sum(int a, int... b) {
		System.out.println("Father");
	}
}

class J162_Son extends J162_Father {
	@Override
	void sum(int a, int[] b) {
		System.out.println("Son");
	}
//	void sum(int a, int b, int c) {
//		System.out.println("Son-part2");
//	}
}

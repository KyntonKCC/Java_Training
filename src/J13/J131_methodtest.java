package J13;

public class J131_methodtest {

	public static void main(String[] args) {
		new J131_methodtest().first();

		J131_Value v = new J131_Value();
		J131_methodtest t = new J131_methodtest();
		t.third(v);
		System.out.println("Main v.i = " + v.i);// 15

		char a[] = { 65, 66, 67, 68, 69 };
		System.out.println(a);

	}

	void first() {
		int i = 5;
		J131_Value v = new J131_Value();
		v.i = 25;
		second(v, i);
		System.out.println(v.i);// 20
	}

	void second(J131_Value v, int i) {
		i = 0;
		v.i = 20;
		J131_Value val = new J131_Value();
		v = val;
		System.out.println(v.i + " " + i);// 15 0
	}

	void third(J131_Value v) {
		v = new J131_Value();
		v.i = 25;
		System.out.println("third v.i = " + v.i);// 25
	}
}

class J131_Value {
	int i = 15;
}
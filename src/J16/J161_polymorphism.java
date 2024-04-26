package J16;

public class J161_polymorphism {

	public static void main(String[] args) {
		J161_SuperClass m1 = new J161_SubClass();
		// m1.sub();//編譯時期看左邊(父類),所以屬性跟方法,父類一定要有,否則編譯錯誤
		m1.objectMethod();// 只有物件方法可以被覆寫
		m1.staticMethod();
		System.out.println(m1.objectVar);
		System.out.println(m1.staticVar);
		// 在多型體系下,只有物件方法看子類,其餘全部看父類

		J161_Sub s = new J161_Sub();
		System.out.println(s.count);// 20
		s.display();// 20 10
		System.out.println("==========");
		J161_Base b = s;// 多型//J161_Base b=new Sub();
		System.out.println(b == s);// true
		System.out.println(b.count);// 10
		b.display();// 20 10

	}

}

class J161_SuperClass {
	int objectVar = 1;
	static int staticVar = 2;

	static void staticMethod() {
		System.out.println("SuperClass的類別方法");
	}

	void objectMethod() {
		System.out.println("SuperClass的物件方法");
	}
}

class J161_SubClass extends J161_SuperClass {
	int objectVar = 11;
	static int staticVar = 22;

	static void staticMethod() {
		System.out.println("SubClass的類別方法");
	}

	@Override // 只有物件方法可以被覆寫
	void objectMethod() {
		System.out.println("SubClass的物件方法");
	}

	void sub() {
		System.out.println("Sub獨自有的物件方法");
	}
}

class J161_Base {
	int count = 10;

	public void display() {
		System.out.println(this.count);// 10
	}
}

class J161_Sub extends J161_Base {
	int count = 20;

	@Override
	public void display() {
		System.out.println(this.count);// 20
		System.out.println(super.count);// 10
	}
}
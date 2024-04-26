package J17;

public class J171_interfacetest {

	public static void main(String[] args) {
		J171_Dog lucky = new J171_Dog();
		lucky.shout();
		lucky.move();// 動物//類優先原則,調用類別的move,而非介面的move
		lucky.show();

	}

}

//"函數式介面(@FunctionalInterface)"指的是介面裡面只能有"一個抽象"方法,但有body的方法.則沒有限制數目,要100個也可以
@FunctionalInterface
interface J171_Pet {
	int age = 2; // public static final

	void shout();

	public default void move() {
		System.out.println("介面的move");
	}

	// void abc();
	// void abc2();

	/* jdk7,11在"介面"中新增三個可以有方法body的方法 
	 * 1.default 
	 * 2.static 
	 * 3.private
	 */
	default void a() {};
	static void b() {};
	private void c() {};
}

class J171_Animal {
	int age = 3;

	void shout() {
		System.out.println("Awwwwww");
	}

	public void move() {
		System.out.println("父類的move");
	}
}

class J171_Dog extends J171_Animal implements J171_Pet {
	int age = 1;

	@Override
	public void shout() {
		System.out.println("Owwwwww");
	}

	@Override
	public void move() {
		System.out.println("子類的move");
	}

	public void show() {
		System.out.println(age);			// 1
		System.out.println(J171_Pet.age);	// 2//介面名詞.age調用介面的
		System.out.println(super.age);		// 3//super.age調用類別的
	}
}

abstract class J171_Father {
	abstract void money();// public protected default
}

abstract class J171_Son extends J171_Father {

}
package J17;

public class J172_interfacetest {

	public static void main(String[] args) {
		// J172_Fish f = new J172_Fish();//介面與抽象類別是無法實體化即new物件
		J172_Shark s = new J172_Shark();
		s.swim();
		J172_FlyFish f = new J172_FlyFish();
		f.fly();
		f.swim();
		J172_Superman hero = new J172_Superman();
		hero.fly();
		hero.swim();

		new J172_Test().method();

		// 需要宣告一個類別才能實作
		J172_Taiwaness t1 = new J172_Taiwaness();
		t1.speak();
		// 以匿名類別(沒有名稱的類別)方式實作Person介面//可以不用宣告類別，以介面實作
		J172_Person t2 = new J172_Person() {
			@Override
			public void speak() {
				System.out.println("台灣人講台語2");
			}
		};
		t2.speak();

		new J172_C().test();

	}

}

interface J172_Swimmer {
	void swim();
}

interface J172_Fly {
	void fly();
}

abstract class J172_Fish implements J172_Swimmer {
//	Fish(){};//抽象類別可以有建構子
}

class J172_Shark extends J172_Fish {
	@Override
	public void swim() {
		System.out.println("鯊魚會游泳");
	}
}

class J172_FlyFish extends J172_Fish implements J172_Fly {
	@Override
	public void swim() {
		System.out.println("飛魚會游泳");
	}

	@Override
	public void fly() {
		System.out.println("飛魚會飛");
	}
}

class J172_Superman implements J172_Fly, J172_Swimmer {
	@Override
	public void swim() {
		System.out.println("超人會游泳");
	}

	@Override
	public void fly() {
		System.out.println("超人會飛");
	}
}

class J172_Test {
	// 此為建構子,須由另一個建構子呼叫,或是new類別物件時呼叫,無法由方法來呼叫建構子
	J172_Test() {
		this(10);
		System.out.println("我是無參數的建構子");
	}
	
	J172_Test(int a) {
		System.out.println("我是有一個參數的建構子");
	}
	
	// 此為一個名稱叫Test的方法,切記,建構子是不能有回傳型態
	void Test() {
		System.out.println("我不是建構子,我是名稱叫Test的方法");
	}
	
	void method() {
		System.out.println("我是method的方法");
		Test();
	}
}

interface J172_Person {
	void speak();
}

class J172_Taiwaness implements J172_Person {
	@Override
	public void speak() {
		System.out.println("台灣人講台語1");
	}
}

interface J172_A {
	int v = 1;
}

class J172_B {
	int v = 2;
}

class J172_C extends J172_B implements J172_A {
	void test() {
		// System.out.println(v);//ambigous//編譯錯誤,類優先只針對方法,屬性沒有類優先
		System.out.println(J172_A.v);// 1
		System.out.println(super.v);// 2
	}
}

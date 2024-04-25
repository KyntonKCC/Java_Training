package J15;

public class J152_polymorphism {

	public static void main(String[] args) {
		J152_polymorphism p = new J152_polymorphism();// shift+alt+a
		p.speakLanguage(new J152_Person());
		p.speakLanguage(new J152_Taiwan());
		p.speakLanguage(new J152_American());
		p.speakLanguage(new J152_Japan());

	}

	void speakLanguage(J152_Person person) {// J152_Person person = new J152_Taiwan();
		person.speak();
		// 多型: 父類別 變數名稱 = new 子類別建構子()
	}

//	// 後續下方皆可省略
//	void speakLanguage(J152_Taiwan taiwan) {//J152_Taiwan taiwan = new J152_Taiwan();
//		taiwan.speak();
//	}
//	
//	void speakLanguage(J152_American american) {
//		american.speak();
//	}
//	
//	void speakLanguage(J152_Japan japan) {
//		japan.speak();
//	}
//	// 省略到此
}

class J152_Person {
	void speak() {
		System.out.println("我是人類,我會講話");
	}
}

class J152_Taiwan extends J152_Person {
	@Override
	void speak() {
		System.out.println("我是台灣人,我會講台語");
	}
}

class J152_American extends J152_Person {
	@Override
	void speak() {
		System.out.println("我是美國人,我會講美語");
	}
}

class J152_Japan extends J152_Person {
	@Override
	void speak() {
		System.out.println("我是日本人,我會講日語");
	}
}

class J152_Father {
	int object = 1;
	static int staticvar = 2;

	void objectMethod() {

	}

	static void staticMethor() {

	}
}

class J152_Son extends J152_Father {
	int object = 1;
	static int staticvar = 2;

	@Override // 只有物件方法可以被覆寫
	void objectMethod() {

	}

	static void staticMethor() {

	}
}
package J13;

public class J134_constructortest {

	public static void main(String[] args) {
		
		J134_Student s = new J134_Student();
		/* 這有兩個參數的建構子100,200 
		 * 我叫Student方法,我不是建構子 
		 * 這是無參數的方法 
		 * 0 
		 * 這有一個參數的建構子99
		 * 這不是預設的建構子,這是無參數的建構子
		 */
		
	}

}

class J134_Student {

	int age;
	/* this()是用來呼叫類別中其他的建構子,且其一定是撰寫在建構子內 
	 * ,不會出現在其他方法中,而且一定要在建構子的第一行 
	 * ,另外 this.XXX 是用來呼叫物件的方法或是物件的屬性 
	 * ,例 this.test();this.age=100; 
	 * ,注意其不可以出現在類別方法中,只能出現在物件方法中
	 */

	J134_Student() {// 無參數的建構子，非 default constructor 預設建構子
		this(99);// 此行才是正確呼叫有一個參數建構子的寫法,但她一定要寫在建構子的第一行
		System.out.println("這不是預設的建構子,這是無參數的建構子");
	}

	J134_Student(int a) {
		this(100, 200);// 此行才是正確呼叫有兩個參數建構子的寫法,但她一定要寫在建構子的第一行
		Student();// 是在呼叫一個名字叫Student的方法,而不是在呼叫無參數的建構子
		System.out.println("這是有一個參數的建構子" + a);
	}

	J134_Student(int a, int b) {
		// this();//此行才是正確呼叫無參數建構子的寫法,但她一定要寫在建構子的第一行//形成無限循環 compilation fails
		System.out.println("這是有兩個參數的建構子" + a + "," + b);
	}

	void test() {
		System.out.println("這是無參數的方法");
	}

	void Student() {
		// this();//一定是撰寫在建構子內
		System.out.println("我叫Student方法,我不是建構子");
		test();// this.test();//完整
		System.out.println(age);// System.out.println(this.age);//完整
		
	}

	static void staticMethod() {
		// this.test();//不能出現在類別方法 Cannot use "this" in a static context
		new J134_Student().test();
	}

}
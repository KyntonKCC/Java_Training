package J14;

public class J143_inherit {

	public static void main(String[] args) {
		// J143_Shape s1 = new J143_Shape();
		J143_Square s2 = new J143_Square();
		s2.foo("bar");
		s2.foo();
		/* Shape:constructor 
		 * Square:foo 
		 * Shape:foo
		 */

	}

}

class J143_Shape {
	public J143_Shape() {// 無參數的建構子
		System.out.println("Shape:constructor");
	}

	public void foo() {// 無參數的方法
		System.out.println("Shape:foo");
	}
}

class J143_Square extends J143_Shape {
	public J143_Square() {// 無參數的建構子
		super();
	}

	public J143_Square(String lable) {// 有一個參數的建構子
		System.out.println("Square:constructor");
	}

	public void foo() {// 無參數的方法
		super.foo();
	}

	public void foo(String lable) {// 有一個參數的方法
		System.out.println("Square:foo");
	}
}

/* 1.類別只能有一個父類別,但介面可以繼承多個介面 
 * 2.類別可以實作多個介面
 */
interface J143_Father1 {
}

interface J143_Father2 {
}

interface J143_Son extends J143_Father1, J143_Father2 {
}

class J143_Start implements J143_Father1, J143_Father2 {
}

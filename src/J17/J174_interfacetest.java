package J17;

public class J174_interfacetest {

	public static void main(String[] args) {
		J174_SubClass sub = new J174_SubClass();
		sub.defaultMethod1(); // SubClass的預設方法1
		sub.defaultMethod2(); // IfaceA的預設方法2,有加public
		J174_IfaceA.staticMethod(); // IfaceA的靜態方法
		sub.method4();
	}

}

//自訂Annotation類別 @interface
interface J174_IfaceA {
	static void staticMethod() {
		System.out.println("IfaceA的靜態方法");
	}

	default void defaultMethod1() {
		System.out.println("IfaceA的預設方法1,沒有加public");
	}

	public default void defaultMethod2() {
		System.out.println("IfaceA的預設方法2,有加public");
	}
}

interface J174_IfaceB {
//	public default void defaultMethod2() {
//		System.out.println("IfaceB的預設方法2,有加public");
//		//二個實作的介面不能有同名方法,會衝突,只能利用子類別覆寫
//	}
}

class J174_SuperClass {
	public void defaultMethod1() {
		System.out.println("SuperClass的預設方法1");
	}
}

class J174_SubClass extends J174_SuperClass implements J174_IfaceA, J174_IfaceB {
	@Override
	public void defaultMethod1() {
		System.out.println("SubClass的預設方法1");
	}

	void method4() {
		defaultMethod1(); // SubClass的預設方法1
		super.defaultMethod1(); // SuperClass的預設方法1
		J174_IfaceA.super.defaultMethod1(); // IfaceA的預設方法1,沒有加public
	}
}

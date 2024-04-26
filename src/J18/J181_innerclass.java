package J18;

//Window -> Show View -> Other -> Navigator(Deprecated)
//Outer.class
//Outer$Inner1.class
//Outer$Inner1$InnerAgain.class
//Outer$Inner2.class
//一般內部類別
class J181_Outer {
	class J181_Inner1 {
		class J181_InnerAgain {
		}
	}

	class J181_Inner2 {

	}
}

public class J181_innerclass {

	public static void main(String[] args) {
		J181_Person amy = new J181_Person();
		amy.show();

		// 另一個外部類別調用靜態內部類別(可看成類別變數)
		J181_Person.J181_Body pBody = new J181_Person.J181_Body();
		pBody.bodyShow();
		// 以匿名物件方式來調用
		new J181_Person.J181_Body().bodyShow();

		// 另一個外部類別調用一般內部類別(可看成物件變數)
		J181_Person.J181_Brain pBrain = new J181_Person().new J181_Brain();
		pBrain.brainShow();
		// 以匿名物件方式來調用
		new J181_Person().new J181_Brain().brainShow();

	}

	void test() {
		int a = 100;
		// 方法內部類別可看成區域變數,不能加上存取權限修飾字,另外,同區域變數一樣,也要先宣告才可調用
		class MethodInnerClass {
			void show() {
				// a=300;//此行錯誤
				//Local variable a defined in an enclosing scope must be final or effectively final
				System.out.println(a);
			}
		}
		MethodInnerClass m = new MethodInnerClass();
	}

	// 初始化區塊 initialize block
	{
		class MethodInnerClass {
		}
	}

	// 建構子
	J181_innerclass() {
		class MethodInnerClass {
		}
	}
}

class J181_Person {
	void show() {
		// 在外部類別的物件方法內可直接呼叫內部類
		J181_Body body = new J181_Body();
		body.bodyShow();
		J181_Brain brain = new J181_Brain();
		brain.brainShow();
	}

	static class J181_Body {// 靜態內部類別
		static int x = 20;// 靜態內部類別則可宣告類別變數
		final static int y = 20;

		void bodyShow() {
			System.out.println("我是靜態的身體");
		}
	}

	class J181_Brain {// 一般內部類別
		int x = 20;

		void brainShow() {
			System.out.println("我是非靜態的大腦");
		}
	}
}
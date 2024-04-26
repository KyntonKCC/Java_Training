package J16;

public class J164_interfacetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/* 1.在介面中所宣告的屬性一定是靜態(static)而其存取權限一定是(public) ,且一定要給定初始值,因為其是常數,有加final
 * 2.在介面中若宣告方法,一定為抽象方法,不能加上方法body{} ,因為編譯器會自動加上public abstract
 *   所以子類實作介面,子類覆寫方法的存取權限一定要是public
 */
interface J164_F {
	int age = 25;// public static final int age = 25

	void test();// public abstract void test();
}

class J164_SomeClass implements J164_F {
	public void test() {

	};
}

interface J164_A {}
interface J164_B {}
interface J164_C {}
class J164_X {}
class J164_Y {}
class J164_Z {}

//介面"可以繼承(extends)多個介面",但"無法實作(implements)另一個介面"
interface J164_D extends J164_A, J164_B, J164_C {};
//interface J164_E implements J164_A{};

//類別"只能繼承(extends)一個類別",但"可以實作(implements)多個介面"
class J164_W extends J164_X {};
//class J164_V extends J164_X,J164_Y{};
class J164_U implements J164_A, J164_B, J164_C {};

//類別,"類優先原則"需先繼承(extends)而後實作(implements)
class J164_T extends J164_X implements J164_A, J164_B, J164_C {};

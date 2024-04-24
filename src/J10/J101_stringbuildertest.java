package J10;

public class J101_stringbuildertest {

	public static void main(String[] args) {
		J101_Person p1 = new J101_Person();
		J101_Person p2 = new J101_Person();
		J101_Person p3 = new J101_Person();
		J101_Person p4 = new J101_Person(10);
		p1.J101_Person();
		p1.showAge();
		p1.common=500;
		p2.common=1000;
		J101_Person.common=5000;
		p1.user=50;
		p2.user=60;
		p3.user=160;
		new J101_Person().user=8000;//匿名物件//沒有物件參考名稱，只是產生一塊記憶體位置、空間
		System.out.println(p1.common);//5000
		System.out.println(p2.common);//5000
		System.out.println(p3.common);//5000
		System.out.println(J101_Person.common);//5000
		System.out.println(p1.user);//50
		System.out.println(p2.user);//60
		System.out.println(p3.user);//160
		System.out.println(new J101_Person().user);//50
	}

}
class J101_Person{
	static int common=100;//類別變數//存於global
	int user=70;//物件變數
	void showAge() {
		System.out.println("測試用");
	}
	public void J101_Person() {//此為方法,因為建構子不能有return type
		System.out.println("這是方法,不是建構子");
	}
	public J101_Person() {//這個是無參數的建構子
		System.out.println("這個是無參數的建構子,每次new類別物件皆會呼叫我");
	}
	public J101_Person(int age) {//這是一個有參數的建構子
		System.out.println("這個是有一個參數的建構子,每次new類別物件皆會呼叫我");
	}
}
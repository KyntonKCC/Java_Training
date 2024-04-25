package J10;

public class J101_stringbuildertest {

	public static void main(String[] args) {
		//String與StringBuilder的差異性
		String s = "KyntonKCC";
		s = s.concat("java").replace("n","ok").substring(3,9);
		//KyntonKCCjava -> KyoktookKCCjava -> ktookK
		System.out.println(s);
		StringBuilder sa = new StringBuilder();
		System.out.println(sa.length());	//0
		System.out.println(sa.capacity());	//16
		StringBuilder sb = new StringBuilder("KyntonKCC");
		sb.replace(2,5,"ok");			//KyoknKCC
		sb.delete(2,4);					//KynKCC
		sb.insert(2,"java");			//KyjavanKCC
		sb.substring(2,6);				//java
		System.out.println(sb);			//KyjavanKCC	//StringBuilder 沒有 substring 的方法
		String sub = sb.substring(2,6);	//java 轉為String
		System.out.println(sub);		//java
		StringBuilder sc = new StringBuilder("KyntonKCC");
		//sb1.replace(2,5,"ok").delete(2,4).insert(2,"java").substring(2,6).replace(2,4,"hello");
		//String字串類replace"語法"錯誤		
		//substring( )後轉為String
		String suc = sc.replace(2,5,"ok").delete(2,4).insert(2,"java").replace(2,4,"hello").substring(2,6).replace("e","hello");
		//KyoknKCC -> KynKCC -> KyjavanKCC -> KyhellovanKCC -> hell -> hhelloll
		System.out.println(suc);
		
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
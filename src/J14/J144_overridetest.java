package J14;

public class J144_overridetest {

	public static void main(String[] args) {
		/*
		 * 1.類別成員有 a.屬性:物件屬性,類別屬性 b.方法:物件方法,類別方法 
		 * 2.上述成員中,記住只有唯一的"物件方法"可以被覆寫(override)
		 * ,其他的三個皆不能被覆寫,其稱為隱藏,即子類別隱藏父類別的成員,執行時顯示的是子類別的內容 
		 * 3.覆寫的方法名稱宣告必須相同
		 * 4.存取權限不可小於原方法,且原方法不能是private或final,否則無法覆寫
		 * 5.一般的方法呼叫時,參數或回傳型態或參考資料型別(有繼承關係)可以自動轉型
		 * ,但方法的覆寫若是"基本資料型態"或是"方法中的參數列(有繼承關係)",並不能轉型,要完全一樣才可以覆寫
		 */
		J144_Boy s = new J144_Boy();
		System.out.println(s.age); // 隱藏
		System.out.println(s.name); // 隱藏
		s.earnMoney(); // 覆寫
		s.showName(); // 隱藏
		System.out.println(s.generalMethod(11.0));

	}

}

//class J144_Creature {
//}
//
//class J144_Animal extends J144_Creature {
//}
//
//class J144_Dog extends J144_Animal {
//}

class J144_Father {
	int age = 120; // 物件屬性
	static String name = "daddy"; // 類別屬性

	void earnMoney() { // 物件方法
		System.out.println("daddy 辛苦賺錢");
	}

	static void showName() { // 類別方法
		System.out.println("稱呼為:" + name);
	}

	double generalMethod(double a) {
		int age = 10;
		return age;
	}
}

class J144_Boy extends J144_Father {
	int age = 20; // 物件屬性
	static String name = "boy"; // 類別屬性

	@Override
	void earnMoney() { // 物件方法
		super.earnMoney();
		System.out.println("boy 輕鬆賺錢");
	}

	static void showName() { // 類別方法
		J144_Father.showName();
		System.out.println("稱呼為:" + name);
	}
}
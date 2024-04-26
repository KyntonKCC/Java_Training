package J18;

import java.util.Arrays;

public class J183_enumtest {
	
//	// 物件初始化區塊會被建構子覆蓋
//	int a;
//	static int b;
//	{// 物件初始化區塊
//		a = 300;
//	}
//	static {// 類別初始化區塊
//		b = 400;
//	}
//
//	J183_enumtest() {// 建構子
//		a = 1000;
//		b = 2000;
//	}

	public static void main(String[] args) {
		System.out.println(J183_JavaProgram0.JAVASE);
		System.out.println(J183_JavaProgram0.JAVAEE);
		System.out.println(J183_JavaProgram0.JAVAME);

		J183_JavaProgram1[] values1 = J183_JavaProgram1.values();
		System.out.println(Arrays.toString(values1));
		J183_JavaProgram2[] values2 = J183_JavaProgram2.values();
		System.out.println(Arrays.toString(values2));

		int result = J183_JavaProgram2.JAVAME.ordinal();// 返回列舉的索引值
		System.out.println(result);// 2

	}

}

//列舉的前世
class J183_JavaProgram0 {
	// 1.定義列舉屬性
	private final String typeName;// final常數,可在建構子或初始化區塊來指定初始值
	private final String typeDescription;

	// 2.私有化建構子,並初始化final常數的值
	private J183_JavaProgram0(String typeName, String typeDescription) {
		this.typeName = typeName;
		this.typeDescription = typeDescription;
	}

	// 3.提供當前列舉的多個物件
	public static final J183_JavaProgram0 JAVASE = new J183_JavaProgram0("標準版", "用於個人電腦,單機用");
	public static final J183_JavaProgram0 JAVAEE = new J183_JavaProgram0("企業版", "用於伺服器");
	public static final J183_JavaProgram0 JAVAME = new J183_JavaProgram0("微型版", "用於小型行動裝置");

	// 4.覆寫Object的toString方法
	@Override
	public String toString() {
		return "JavaProgram [typeName=" + typeName + ", typeDescription=" + typeDescription + "]";
	}
}

//列舉的今生
enum J183_JavaProgram1 {
	// 3.提供當前列舉的多個物件
	JAVASE("標準版", "用於個人電腦,單機用"), // 0
	JAVAEE("企業版", "用於伺服器"), // 1
	JAVAME("微型版", "用於小型行動裝置"); // 2

	// 1.定義列舉屬性
	private final String typeName;// final常數,可在建構子或初始化區塊來指定初始值
	private final String typeDescription;

	// 2.私有化建構子,並初始化final常數的值
	private J183_JavaProgram1(String typeName, String typeDescription) {
		this.typeName = typeName;
		this.typeDescription = typeDescription;
	}

	// 4.覆寫Object的toString方法
	@Override
	public String toString() {
		return "JavaProgram [typeName=" + typeName + ", typeDescription=" + typeDescription + "]";
	}
}

//列舉的今生
enum J183_JavaProgram2 {
	JAVASE("標準版", "用於個人電腦,單機用"), JAVAEE("企業版", "用於伺服器"), JAVAME("微型版", "用於小型行動裝置");

	String typeName;
	String typeDescription;

	private J183_JavaProgram2(String typeName, String typeDescription) {
		this.typeName = typeName;
		this.typeDescription = typeDescription;
	}
}

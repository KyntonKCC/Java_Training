package J14;

public class J141_inherit {

	public static void main(String[] args) {
		/* 1.子類別除了繼承父類別的資源,還有自己的資源,所以是extends延伸的概念 
		 * 2.父類別是無法存取子類別的資源
		 */
		J141_Manager m = new J141_Manager();
		m.name = "amy";
		m.age = 25;
		m.salary = 50000;
		m.showInfo();
		m.department = "管理部";
		System.out.println("部門名稱為:" + m.department);
		J141_Employee e = new J141_Employee();
		e.name = "無名氏";
		// e.department="hello";父類別是無法存取子類別的資源

	}

}

class J141_Employee {
	String name;
	int salary;
	int age;

	void showInfo() {
		System.out.println("姓名:" + name);
		System.out.println("薪資:" + salary);
		System.out.println("年齡:" + age);
	}
}

/* final 修飾字 
 * 1.變數加上 final 就變成"常數",即內容無法再更改 
 * 2.類別加上 final 就結扎了,無法再生小孩,即無法被繼承
 * 3.方法加上 final 即無法被覆寫(Override 子類別覆寫覆類別同名方法)
 */
class J141_Manager extends J141_Employee {
	String department;
}
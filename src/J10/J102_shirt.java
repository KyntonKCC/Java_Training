package J10;

public class J102_shirt {
	// 區域變數
	public static int shirtID = 22000;// 加static每個物件各自維護
	public char colorCode;
	public String size;
	public double price;
	public String description;

	// 宣告四個參數的建構子,物件變數
	public J102_shirt(char colorCode, String size, double price, String description) {
		shirtID++;
		this.colorCode = colorCode;
		this.size = size;
		this.price = price;
		this.description = description;
	}

	//設值方法
	public void setPrice(double price) {
		this.price = price;
	}
	//取值方法
	public double getPrice() {
		return price;
	}

	public void displayInformation() {
		String a = "=";
		System.out.println(a.repeat(20));
		System.out.println("商品編號:" + shirtID);
		System.out.println("商品色彩:" + colorCode);
		System.out.println("商品尺寸:" + size);
		System.out.println("商品價格:" + price);
		System.out.println("商品描述:" + description);
	}

	public static void main(String[] args) {
		J102_shirt s1 = new J102_shirt('B', "XL", 150, "夏季最新款");
		s1.displayInformation();
		J102_shirt s2 = new J102_shirt('R', "LL", 350, "秋季最新款");
		s2.displayInformation();
		J102_shirt s3 = new J102_shirt('C', "M", 550, "冬季最新款");
		s3.displayInformation();

		J102_Person p1 = new J102_Person();
		p1.setAge(30);
		System.out.println(p1.getAge());
		p1.setAge(10);
		System.out.println(p1.getAge());

	}

}

class J102_Person {
	private int age;

	// 存取權限為private 需要使用setters,getters
	public void setAge(int age) {
		if (age >= 25)
			this.age = 25;
		else
			this.age = age;
	}

	public int getAge() {
		return age;
	}
}

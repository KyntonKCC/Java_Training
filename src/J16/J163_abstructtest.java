package J16;

public class J163_abstructtest {

	public static void main(String[] args) {
		//J163_Abs1 a = new J163_Abs1();//此行錯誤,因為抽象類別無法實體化

		//J163_Shape s = new J163_Shape();//此行錯誤,因為抽象類別無法實體化

		J163_Rectangle r = new J163_Rectangle(5,6);
		r.area();
		r.perimeter();
		J163_Circle c = new J163_Circle(5.2);
		c.area();
		c.perimeter();

	}

}
//宣告一個抽象類別 注意,抽象類別內沒有規定一定要有抽象方法,但若一個類別裡有一個抽象方法,則此類別一定要宣告為抽象類別
//抽象類別因為是拿來做規範,就主要是由子類來實作,所以抽象類是無法實體化即 new xxx();
abstract class J163_Abs1{
	void test() {

	}
	static void test1() {

	}
}
//但若一個類別裡有一個抽象方法,則此類別一定要宣告為抽象類別
//一個方法若有方法body則不能宣告為 abstract 反之若一個方法加上abstract修飾字 例 abstract void method(); 則此方法絕對不能有方法body{ }
abstract class J163_Abs2{
	abstract void test();
}


abstract class J163_Shape{
	J163_Shape(){
		System.out.println("I am shape's constructor");
	}
	//宣告二個抽象方法,用來"規範繼承的子類別必須實作"
	abstract void area();
	abstract void perimeter();
}

class J163_Rectangle extends J163_Shape{
	int width;
	int length;

	public J163_Rectangle(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	void area() {
		System.out.printf("長為%d,寬為%d,矩形面積為%d\n",length,width,length*width);
	}

	@Override
	void perimeter() {
		System.out.printf("長為%d,寬為%d,矩形周長為%d\n",length,width,2*(length+width));
	}
}

class J163_Circle extends J163_Shape{
	double radius;

	public J163_Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	void area() {
		System.out.printf("半徑為%.1f,圓面積為%.1f\n",radius,radius*radius*Math.PI);
	}

	@Override
	void perimeter() {
		System.out.printf("半徑為%.1f,圓周長為%.1f\n",radius,2*radius*Math.PI);
	}
}
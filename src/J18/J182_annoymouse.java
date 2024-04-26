package J18;

//1
@FunctionalInterface
interface J182_Pet {
	void move();
}

//2
class J182_Dog implements J182_Pet {
	@Override
	public void move() {
		System.out.println("狗會跑0");
	}
}

public class J182_annoymouse {

	public static void main(String[] args) {
		// 3
		J182_Dog Tom = new J182_Dog();
		Tom.move();

		// 以匿名類別$方式改寫2,3,步驟 { };
		J182_Pet rich = new J182_Pet() {
			@Override
			public void move() {
				System.out.println("狗會跑1");
			}
		};
		rich.move();

		J182_Pet rich1 = new J182_Pet() {
			@Override
			public void move() {
				System.out.println("狗會跑2");
			}

			public void bite() {
				System.out.println("狗會咬人");
			}
		};
		rich1.move();
		// rich1.bite();//此行錯誤,父類別無法看到子類別,多型概念

		// Lambda表達式,前提是@FunctionalInterface
		J182_Pet rich2 = () -> System.out.println("狗會跑3");
		rich2.move();

	}

}
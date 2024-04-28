package J21;

public class J212_threadtest {

	public static void main(String[] args) {
		// 3.new 子類物件
		J212_MyThread1 my1 = new J212_MyThread1();

		// 將步驟1,2,3改匿名類別
		Runnable my2 = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 50; i++) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
				}
			}
		};

		// 改Lambda表達式
		Runnable my3 = () -> {
			for (int i = 1; i <= 50; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
			}
		};

		// 將步驟1,2,3,4改匿名類別,匿名物件
		Thread t4 = new Thread(() -> {
			for (int i = 1; i <= 50; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
			}
		}, "路人丁");

		// 4.將步驟3的物件當參數,指定給Thread建構子
		Thread t1 = new Thread(my1, "路人甲");
		Thread t2 = new Thread(my2, "路人乙");
		Thread t3 = new Thread(my3, "路人丙");
		// 5.利用start方法啟動執行緒
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		Thread.currentThread().setName("主方法");
		for (int i = 1; i <= 50; i++)
			System.out.println(Thread.currentThread().getName() + " : " + i);
	}

}

// 方式二
// 1.宣告類別實作 Runnable 介面
class J212_MyThread1 implements Runnable {
	// 2.覆寫 run 方法
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}
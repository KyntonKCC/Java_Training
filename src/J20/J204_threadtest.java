package J20;

public class J204_threadtest {

	public static void main(String[] args) {
		J204_MyThread1 t1 = new J204_MyThread1("VieShow");
		t1.start();
		
		J204_MyThread2 t2 = new J204_MyThread2();
		Thread t3 = new Thread(t2, "ShowTime");
		t3.start();
		
		Thread.currentThread().setName("Cinemax");
		for (int m = 0; m <= 100; m++) 
			System.out.println(Thread.currentThread().getName() + " : " + m);

	}

}

//1.宣告自訂類別繼承 Thread 類並覆寫其 run 方法
class J204_MyThread1 extends Thread {
	J204_MyThread1(String msg) {
		super(msg);
	}

	@Override
	public void run() {
		// 這裡面就是多執行緒要執行的程式
		for (int m = 0; m <= 100; m++) {
			System.out.println(currentThread().getName() + " : " + m);
		}
	}
}

//2.
class J204_MyThread2 implements Runnable {
	@Override
	public void run() {
		for (int m = 0; m <= 100; m++) {
			System.out.println(Thread.currentThread().getName() + " : " + m);
		}
	}
}
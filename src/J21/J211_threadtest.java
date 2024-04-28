package J21;

public class J211_threadtest {

	public static void main(String[] args) {
		/* 撰寫多執行緒的方式有四種 
		 * 1.繼承 Thread 類 
		 * 2.實作 Runnable 介面 
		 * 3.實作 Callable 介面 
		 * 4.使用執行緒池 Executors 及 ExecutorService
		 */

		// 3.new 子類繼承
		J211_MyThread1 t1 = new J211_MyThread1("自訂執行緒");
		J211_MyThread1 t2 = new J211_MyThread1("路人乙");
		t1.setName("路人甲");
		// 4.啟動執行緒
		// t1.run();//無交替效果
		t1.start();
		t2.start();
		
		Thread.currentThread().setName("主方法");
		for (int i = 1; i <= 50; i++) 
			System.out.println(Thread.currentThread().getName() + " : " + i);

	}

}

// 方式一 繼承 Thread 類
// 1.宣告類別繼承 Thread 類
class J211_MyThread1 extends Thread {
	J211_MyThread1(String msg) {
		super(msg);
	}

	// 2.覆寫 run 方法,run 方法內撰寫執行緒要工作的程式
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(getName() + " : " + i);
//			try {
//				sleep(50);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
}
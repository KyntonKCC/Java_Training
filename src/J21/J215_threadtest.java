package J21;

public class J215_threadtest {

	public static void main(String[] args) {
		// 執行緒之安全問題
		// 解決執行緒之安全問題,利用同步化(synchronized),同步化方式有三種
		// 1.同步區塊
		// 2.同步方法
		// 3.使用 Lock 介面
		J215_MyThread1 t1 = new J215_MyThread1("窗口1購買成功");
		J215_MyThread1 t2 = new J215_MyThread1("窗口2購買成功");
		J215_MyThread1 t3 = new J215_MyThread1("窗口3購買成功");
		t1.start();
		t2.start();
		t3.start();

	}

}

// 1.同步區塊
class J215_MyThread1 extends Thread {
	J215_MyThread1(String msg) {
		super(msg);
	}

	static int ticket = 200;
//	static Object obj = new Object();

	@Override
	public void run() {
		while (ticket > 0) {
			synchronized (J215_threadtest.class) {
				if (ticket > 0) {
					ticket--;
					System.out.println(getName() + " : 還剩下" + ticket + "張");
				}
				try {
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
package J22;

import java.util.concurrent.locks.ReentrantLock;

public class J222_threadtest {

	public static void main(String[] args) {
		// 執行緒之安全問題
		// 解決執行緒之安全問題,利用同步化(synchronized),同步化方式有三種
		// 1.同步區塊
		// 2.同步方法
		// 3.使用 Lock 介面
		J222_MyThread1 t1 = new J222_MyThread1("窗口1購買成功");
		J222_MyThread1 t2 = new J222_MyThread1("窗口2購買成功");
		J222_MyThread1 t3 = new J222_MyThread1("窗口3購買成功");
		t1.start();
		t2.start();
		t3.start();
	}

}

// 3.使用 Lock 介面
class J222_MyThread1 extends Thread {
	J222_MyThread1(String msg) {
		super(msg);
	}

	static int ticket = 500;
	static ReentrantLock lock = new ReentrantLock();

	@Override
	public void run() {
		while (ticket > 0) {
			try {
				lock.lock();
				if (ticket > 0) {
					ticket--;
					System.out.println(Thread.currentThread().getName() + " : 還剩下" + ticket + "張");
				}
			} finally {
				lock.unlock();
			}
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
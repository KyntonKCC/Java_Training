package J21;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class J214_threadtest {

	public static void main(String[] args) {
		// 利用執行緒池來創建執行緒
		ExecutorService service = Executors.newFixedThreadPool(5);
		service.execute(new J214_MyThread1());
		service.execute(new J214_MyThread2());
		service.submit(new J214_MyThread3());
		service.shutdown();

	}

}

// 方式四
// 利用 Runnable 創建二個執行緒
class J214_MyThread1 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}

class J214_MyThread2 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}

// 利用 Callable 創建一個執行緒
class J214_MyThread3 implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
//			sum += i;
//			Thread.sleep(50);
		}
		return sum;
	}
}
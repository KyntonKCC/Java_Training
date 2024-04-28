package J21;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class J213_threadtest {

	public static void main(String[] args) throws Exception{
		// 3.new 實作 Callable 類別物件
		J213_MyThread my = new J213_MyThread();
		FutureTask task = new FutureTask(my);
		// 4.將 FutureTask 的物件,當參數傳給 Thread 建構子
		Thread t1 = new Thread(task, "自訂執行緒");
		t1.start();
		Thread.currentThread().setName("主方法");
		for (int i = 0; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		System.out.println("取得加總的結果為:" + task.get());

	}

}

// 方式三
// 1.宣告類別實作 Callable 介面
class J213_MyThread implements Callable<Integer> {
// 2.實作 call 方法
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			sum += i;
		}
		return sum;
	}
}
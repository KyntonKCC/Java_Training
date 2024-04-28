package J22;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class J223_threadtest {

	public static void main(String[] args) throws Exception {
		try {
			List<String> list = new CopyOnWriteArrayList<String>();
			list.add("a1");
			list.add("a2");
			list.add("a3");
			list.add("a4");
			list.add("a5");
			list.add("a6");
			Thread thread = new Thread(new J223_ThreadExample(list));
			thread.start();
			for (String s : list) {
				System.out.println(s);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		var c = new CopyOnWriteArrayList<>(List.of("1", "2", "3", "4"));
		System.out.println(c);
		Runnable r = () -> {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			c.set(3, "four");
			c.add("2");
			c.add("7");
			System.out.print(c + " ");
		};
		Thread t = new Thread(r, "我的執行緒");
		t.start();
		for (var s : c) {
			System.out.print(s + " ");
			Thread.sleep(500);
		}

	}

}

class J223_ThreadExample implements Runnable {
	private List<String> list;

	public J223_ThreadExample(List<String> list) {
		this.list = list;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				list.add("b" + i);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		System.out.println(list);
	}
}
package J24;

import java.util.ArrayDeque;
import java.util.Deque;

public class J244_dequetest {

	public static void main(String[] args) {
		// 堆疊 STACK //先進後出 FILO (First in Last out)
		Deque stack1 = new ArrayDeque();
		stack1.push("one");
		stack1.push("two");
		stack1.push("three");
		// 若是將pop改為peek則不會刪除,那麼內容皆存在,執行結果為three three three [three,two,one]
		System.out.println(stack1.peek());
		System.out.println(stack1.peek());
		System.out.println(stack1.peek());
		System.out.println(stack1);
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1);

		// 佇列 QUEUE //先進先出 FIFO (First in First out)
		Deque stack2 = new ArrayDeque();
		stack2.add("one");
		stack2.add("two");
		stack2.add("three");
		System.out.println(stack2.remove());
		System.out.println(stack2.remove());
		System.out.println(stack2.remove());
		System.out.println(stack2);

	}

}

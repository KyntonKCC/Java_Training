package J19;

import java.io.IOException;

@SuppressWarnings("all")//壓抑警告
public class J193_annotationtest {

	public static void main(String[] args) {
		@Deprecated
		Integer a = new Integer(10);
		int b;
	}

	@SafeVarargs
	public static <T> void add(T... a) {

	}
}

@FunctionalInterface
interface J193_Pet {
	void run();
}

class J193_Father {
	void test() throws Exception {

	}
}

class J193_Son extends J193_Father {
	@Override
	public void test() throws IOException {

	}
}
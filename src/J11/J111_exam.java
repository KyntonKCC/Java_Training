package J11;

import java.util.Arrays;

public class J111_exam {
	// 17.
	static int B = 200;
	int C = 400;
	void test(int C) {
		System.out.println(C);
		System.out.println("這是物件變數的" + this.C);
	}
	static String args[] = { "hello", "java", "how", "are", "you" };

	public static void main(String[] args) {
		// 1.
		StringBuilder sb1 = new StringBuilder(5);
		sb1.append("HOWDY"); 		// HOWDY
		sb1.insert(0, ' '); 		// _HOWDY
		sb1.replace(3, 5, "LL"); 	// _HOLLY
		sb1.insert(6, "COW"); 		// _HOLLYCOW
		sb1.delete(2, 7); 			// _HOW
		System.out.println(sb1.length()); // 4

		// 3.
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.mismatch(a, b));// -1
		System.out.println(Arrays.compare(a, b));// 0

		// 4.
		String[][] arr = { { "red", "white" }, { "black" }, { "blue", "yellow", "green", "violet" } };
		System.out.println(arr.length);		// 3
		System.out.println(arr[0].length);	// 2
		System.out.println(arr[1].length);	// 1
		System.out.println(arr[2].length);	// 4
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++)
				System.out.printf("[%d,%d]=%s\t", row, column, arr[row][column]);
			System.out.println();
		}

		// 5.
		StringBuilder s1 = new StringBuilder("ABCD");
		s1.replace(s1.indexOf("B"), s1.indexOf("C"), "Q");
		System.out.println(s1);

		// 6.
		StringBuilder sb2 = new StringBuilder(5);
		String s2 = "";
		System.out.println(sb2.length());	// 0
		System.out.println(sb2.capacity());	// 5
		System.out.println(s2.length());	// 0
		if (sb2.equals(s2)) { 					// 用物件Object的equals
			System.out.println("Match 1");
		} else if (sb2.toString().equals(s2)) { // 用物件String的equals
			System.out.println("Match 2");
		} else {
			System.out.println("No Match");
		}

		// 7.
		String ta = "A ";
		ta = ta.concat("B ");
		String tb = "C ";
		ta = ta.concat(tb);
		ta.replace('C', 'D');
		ta = ta.concat(tb);
		System.out.println(ta);

		// 8.
		int c[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < 5; i += 2)
			System.out.print(c[i] + " ");
		System.out.println();

		// 9.
		String shirts[][] = new String[2][2];
		shirts[0][0] = "red";
		shirts[0][1] = "blue";
		shirts[1][0] = "small";
		shirts[1][1] = "medium";
		for (int index = 0; index < 2;) {
			for (int idx = 0; idx < 2;) {
				System.out.print(shirts[index][idx] + ":");
				idx++;
			}
			index++;
		}
		System.out.println();

		// 10.
		String chs[][] = new String[2][];
		chs[0] = new String[2];
		chs[1] = new String[5];
		int i = 97;
		for (int x = 0; x < chs.length; x++) {
			for (int y = 0; y < chs.length; y++) {
				chs[x][y] = "" + i;
				i++;
			}
		}
		for (String[] ca : chs) {
			for (String x : ca)
				System.out.print(x + " ");
			System.out.println();
		}

		// 12.
		String s = "this is it";
		int x = s.indexOf("is");
		s.substring(x + 3);
		x = s.indexOf("is");
		System.out.println(s + " " + x);

		// 13.
		String s3 = new String("ORACLE");
		String s4 = "ORACLE";
		String s5 = s3.intern();
		System.out.println(s3 == s4);// false
		System.out.println(s4 == s5);// true
		System.out.println(s3 == s5);// false

		// 17.
		int B = 100;
		System.out.println(B);
		System.out.println(J111_exam.B);
		new J111_exam().test(300);
		// Run as -> Run Configurations -> Arguments
		System.out.println(args[1] + " " + args[2] + " " + args[3] + " " + "jumping");
		System.out.println(J111_exam.args[1] + " " + J111_exam.args[2] + " " + J111_exam.args[3] + " " + "jumping");

	}

}

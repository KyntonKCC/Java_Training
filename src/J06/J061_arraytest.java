package J06;

public class J061_arraytest {

	public static void main(String[] args) {
		// 陣列宣告三步驟
		// 1.宣告Declaration 語法:資料型態 陣列名稱[];
		int a[];
		// 2.實體化Instantiated 語法:new 資料型態[長度];
		a = new int[5];
		// 3.初始化Initialization 語法:陣列名稱[索引值]=值;
		a[0] = 55;
		a[1] = 88;
		a[2] = 13;
		a[3] = 68;
		a[4] = 21;
		// a[5]=55;
		for (int x : a)
			System.out.print(x + " ");
		System.out.println();
		// 宣告+實體化
		int b[] = new int[5];
		// 實體化+初始化
		int c[];
		c = new int[] { 55, 88, 13, 68, 21 };
		// 宣告+實體化+初始化
		int d[] = new int[] { 55, 88, 13, 68, 21 };
		int e[] = { 55, 88, 13, 68, 21 };
		var f = 100;
		var g = "hello";
		var h = new int[5];
		var k = new int[] { 55, 88, 13, 68, 21 };
		// var l={55,88,13,68,21};
		System.out.println(k[2]);
		for (int x : k)
			System.out.println(x);

		// 二維陣列
		int o[][] = new int[][] { { 21, 22, 33, 11, 76 }, { 55, 66, 99, 98, 34 } };
		// standard for loop
		System.out.println(o.length);// 2
		System.out.println(o[1].length);// 5
		for (int m = 0; m < o.length; m++) {
			for (int n = 0; n < o[m].length; n++)
				System.out.print(o[m][n] + "\t");
			System.out.println();
		}
		int p[] = { 1, 2, 3, 4, 5 };
		// enhance for loop 一維陣列
		for (int x : p)
			System.out.print(x + "\t");
		System.out.println();
		// enhance for loop 二維陣列
		for (int[] x : o) {
			for (int z : x)
				System.out.print(z + "\t");
			System.out.println();
		}
		int q[][] = { { 1, 2 }, { 55, 66, 77, 88, 99 }, { 43, 54, 61 }, { 100 } };
		System.out.printf("q.length=%d\n", q.length);// 4
		for (int m = 0; m < q.length; m++)
			System.out.printf("c[%d].length=%d\n", m, q[m].length);
		System.out.println("利用standard for loop印出非對稱二維陣列內容");
		for (int m = 0; m < q.length; m++) {
			for (int n = 0; n < q[m].length; n++)
				System.out.print(q[m][n] + "\t");
			System.out.println();
		}
		System.out.println("利用foreach印出非對稱二維陣列內容");
		for (int[] x : q) {
			for (int z : x)
				System.out.print(z + "\t");
			System.out.println();
		}

		// 1.宣告一個二維陣列
		int r[][];
		// 2.實體化,但只實體化第一維,因為第二為是非對稱,欄數不一樣
		r = new int[2][];
		// 3.再實體化第二維,給他不同長度
		r[0] = new int[2];
		r[1] = new int[6];
		// 4.再利用foreach印出非對稱二維陣列內容
		for (int[] x : r) {
			for (int y : x)
				System.out.print(y + "\t");
			System.out.println();
		}
		
	}

}

package J07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class J071_arraytest {
	int age;

	void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
//		int a[][] = { { 0, 1, 2 }, { 9, 9, 9, 9 } };
//		System.out.println(a.length);	// 2
//		System.out.println(a[0].length);// 3
//		System.out.println(a[1].length);// 4
//		System.out.println(a[1].getClass().isArray());// true
//		System.out.println(a[0][1]);	// 1

//		int array[] = { 5, 4, 3, 2, 1 };
//		System.out.println(array);// 印hashcode 雜湊碼
//		System.out.println(Arrays.toString(array));// [5 4 3 2 1]
//		System.arraycopy(array, 3, array, 2, 2);
//		// System.arraycopy(複製的來源陣列,陣列開始的索引值,複製到目的地,的哪個索引值,複製的長度);
//		System.out.println(Arrays.toString(array));// [5 4 2 1 1]
//		for (int x : array)
//			System.out.print(x + "\t");
//		System.out.println();

//		// run as -> run configuration -> arguments
//		System.out.println(args);
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);

//		int a1[] = { 1, 2, 3, 4 };
//		int a2[] = { 1, 3, 5, 7, 9, 11, 13 };
//		a2 = a1;// 將a1的記憶體位置指定給a2
//		for (int i : a2)
//			System.out.print(i + " ");

//		System.out.println(new J071_arraytest().age);// 0
//		J071_arraytest amy = new J071_arraytest();
//		System.out.println(amy.age);// 0
//		amy.setAge(25);
//		System.out.println(amy.age);// 25

//		String[] stars = { "Venus", "Earth", "Sun", "Moon" };
//		System.out.println(stars.length + " " + stars[1].length());
//		// 陣列長度用"屬性" 陣列名稱.length
//		// 字串長度用"方法" 字串.length()

		/* toString( )將陣列轉成字串  
		 * asList( )將陣列轉成"固定長度"的List  
		 * stream( )將陣列轉成對應資料型態之資料流 
		 * compare( )比較二陣列是否相同回傳0,前大於後1,後大於前-1  
		 * mismatch( )比較二陣列是否不同,若完全相同回傳-1,若不同回傳第一個不同之索引值  
		 * sort( )陣列之排序
		 */
		int a[] = { 11, 22, 33, 44, 55 };
		System.out.println(Arrays.toString(a));// [11, 22, 33, 44, 55]
		Integer b[] = { 66, 3, 77, 150, 88, 2, 99, 500, 100 };
		List<Integer> asList = Arrays.asList(b);// asList() return fixed 集合
		// asList.add(101);//Runtime Exception// "固定長度"不能添加
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(100);// 可以添加
		Stream<Integer> stream = Arrays.stream(b);// 將陣列轉成資料流
		// stream.forEach(x->System.out.println(x));//Lambda表達式
		stream.forEach(System.out::println);// 方法參照
		Arrays.sort(b);// 排序
		for (int x : b)
			System.out.printf("%d ", x);
		System.out.println();
		int w[] = { 1, 2, 3, 4, 5 };
		int x[] = { 1, 2, 3, 4, 5 };
		int y[] = { 1, 1, 3, 4, 5 };
		int z[] = { 1, 2, 3, 5, 5 };
		System.out.println(Arrays.compare(w, x));// 0
		System.out.println(Arrays.compare(w, y));// 1
		System.out.println(Arrays.compare(w, z));// -1
		System.out.println(Arrays.mismatch(w, x));// -1
		System.out.println(Arrays.mismatch(w, y));// 1
		System.out.println(Arrays.mismatch(w, z));// 3

	}

}

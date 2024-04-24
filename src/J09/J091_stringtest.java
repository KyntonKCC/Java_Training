package J09;

import java.util.Scanner;

public class J091_stringtest {

	public static void main(String[] args) {
		// 2.擷取類型 
		/*  a.indexOf()返回指定字串第一次出現的索引值 
		 *  b.lastIndexOf()返回指定字串最後一次出現的索引值
		 *  c.substring(begin)返回begin到最後的字串 
		 *  d.substring(begin,end)返回begin到end-1的字串
		 *  e.length()返回字串長度
		 */
		String a = "KyntonKCC";
		System.out.println(a.indexOf("K"));// 0
		System.out.println(a.lastIndexOf("K"));// 6
		System.out.println(a.substring(3));// tonKCC
		// System.out.println(a.substring(13));//StringIndexOutOfBoundsException
		System.out.println(a.substring(2, 5));// nto
		System.out.println(a.substring(2, 2));// 無返回值
		System.out.println(a.substring(2, 3));// n
		System.out.println(a.length());// 9

		// 3.轉換類型 
		/*  a.concat("string")字串結合,可看成加法運算,但加法可結合null值 
		 *   ,方法不行會出現NullPointerException
		 *  b.intern()會去找字串池內有無相同的字串,若有則返回該字串的位置 
		 *   ,若沒有則在字串池產生一新字串,並返回該字串的位置
		 *  c.replace(old,new)將就字串全部以新字串取代 
		 *  d.lines()將字串轉成Stream,可計數行數 
		 *  e.repeat()重複產生字串
		 *  f.toLowerCase()轉小寫 
		 *  g.toUpperCase()轉大寫 
		 *  h.trim()刪除前後空白,只能刪除半形
		 *  i.strip()刪除前後空白,全形也可刪除 
		 *  j.stripLeading()刪除前面空白 
		 *  k.stripTrailing()刪除後面空白
		 *  l.split("字符")將字串以某字符分割,並儲存到陣列中 
		 *  m.toCharArrays()將字串轉為字元陣列
		 *  n.valueOf()將數值轉為字串 
		 *  o.數值.parseXXX()將字串轉為數值
		 */
		System.out.println("1" + 2 + 3);// 123
		System.out.println(5 + 6 + "1" + 2 + 3);// 11123
		String b = null;
		System.out.println("hello" + b);
		// System.out.println("hello".concat(b));//NullPointerException
		// Cannot invoke "String.isEmpty()" because "str" is null

		String s1 = new String("oracle");
		String s2 = "oracle";
		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));// true
		String s3 = s1.intern();
		System.out.println(s1 == s3);// false
		System.out.println(s2 == s3);// true
		System.out.println(s1.equals(s3));// true

		String c = "KyntonKCC";
		System.out.println(c.replace("n", "java"));// KyjavatojavaKCC
		String d = "hello\njava\noracle\nok";
		System.out.println(d.lines().count());// 4
		System.out.println(c.repeat(5));

		String e = "KyntonKCC";
		String f = " KyntonKCC ";
		String g = "　KyntonKCC　";
		System.out.println(e.toLowerCase());
		System.out.println(e.toUpperCase());
		System.out.println("頭" + f + "尾");
		System.out.println("頭" + f.trim() + "尾");
		System.out.println("頭" + g.trim() + "尾");
		System.out.println("頭" + g.strip() + "尾");
		System.out.println("頭" + g.stripLeading() + "尾");
		System.out.println("頭" + g.stripTrailing() + "尾");

		String color = "red,green,blue,cyan,magenta,yello,black";
		String[] colors = color.split(",");
		for (String x : colors)
			System.out.println(x);
		
		char[] h = e.toCharArray();
		for (char x : h)
			System.out.println(x);
		
		int i = 80;
		String j = "80";
		System.out.println(String.valueOf(i));
		System.out.println(Integer.parseInt(j));

	}

}

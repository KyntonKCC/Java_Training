package J08;

public class J082_stringtest {

	public static void main(String[] args) {
		// 下列情形會以標準建構物件方式建構字串
		// 將字元陣列轉為字串
		char aa[] = { 'h', 'o', 'w', ' ', 'a', 'r', 'e', ' ', 'y', 'o', 'u' };
		String ee = "";
		for (char x : aa)
			ee += x;
		System.out.println(ee);
		String bb = new String(aa);
		System.out.println(bb);
		byte cc[] = { 65, 66, 67, 68, 69, 70 };
		String dd = new String(cc);
		System.out.println(dd);

		// String常用方法
		// 1.判斷類型
		/*  a.isEmpty()判斷字串是否為空,完全無內容才是true 
		 *  b.isBlank()判斷自船是否為空白,包含" ",或"\t"
		 *  c.equals()判斷二字串內容是否相同,有區分大小寫 
		 *  d.equalsIgnoreCase()判斷二字串內容是否相同,沒有區分大小寫
		 *  e.contains()判斷是否包含某字串 
		 *  f.startsWith()判斷是否由某字串為開頭 
		 *  g.endsWith()判斷是否由某字串為結束
		 */
		String a = "";
		String b = " ";
		String c = "\t";
		System.out.println("====empty====");
		System.out.println(a.isEmpty()); // true
		System.out.println(b.isEmpty()); // false
		System.out.println(c.isEmpty()); // false
		System.out.println("====blank====");
		System.out.println(a.isBlank()); // true
		System.out.println(b.isBlank()); // true
		System.out.println(c.isBlank()); // true
		String d = "java";
		String e = "java";
		String f = "JAVA";
		System.out.println("====equals====");
		System.out.println(d.equals(e)); // true
		System.out.println(d.equals(f)); // false
		System.out.println("====equalsIgnoreCase====");
		System.out.println(d.equalsIgnoreCase(e)); // true
		System.out.println(d.equalsIgnoreCase(f)); // true
		String g = "http://www.google.tw";
		System.out.println("====contains====");
		System.out.println(g.contains("goo")); // true
		System.out.println(g.contains("gooo")); // false
		System.out.println("====startsWith====");
		System.out.println(g.startsWith("http")); // true
		System.out.println(g.startsWith("https")); // false
		System.out.println("====endsWith====");
		System.out.println(g.endsWith(".tw")); // true
		System.out.println(g.endsWith(".cn")); // false
		// 2.擷取類型
		/*  a.compareTo()按ascii值比較兩個字串,若是皆相同回傳0,若不同則回傳不同字元之ascii差值
		 *   ,若前面皆相同,字數不同則回傳字數差值
		 *  b.compareToIgnoreCase()
		 *  c.charAt()返回指定索引值之字元,若超出索引會出現StringIndexOutOfBoundsException
		 */
		String h = "java";
		String i = "java";
		String j = "jAva";
		String k = "java1234";
		System.out.println(h.compareTo(i)); // 0
		System.out.println(h.compareTo(j)); // 97(a)-65(A)=32
		System.out.println(h.compareToIgnoreCase(j)); // 0
		System.out.println(h.compareTo(k)); // 4-8=-4
		String l = "KyntonKCC";
		System.out.println(l.charAt(4)); // o
		// System.out.println(l.charAt(11)); //StringIndexOutOfBoundsException

	}

}

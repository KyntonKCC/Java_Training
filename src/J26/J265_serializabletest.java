package J26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;

public class J265_serializabletest {

	public static void main(String[] args) throws Exception {
		// 序列化 用ObjectOutputStream 類保存基本資料型態或物件的機制
		ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("J265_serializabletest_info1.dat"));
		oos1.writeObject(new String("KyntonKCC"));
		oos1.flush();
		oos1.close();
		// 反序列化 用ObjectInputStream 類讀取基本資料型態或物件的機制
		ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("J265_serializabletest_info1.dat"));
		Object obj1 = ois1.readObject();
		String str1 = (String) obj1;
		System.out.println(str1);
		ois1.close();
		// PS:不能序列化 transient 修飾的成員變數

		// 序列化
		ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("J265_serializabletest_info2.dat"));
		oos2.writeObject(new String("KyntonKCC"));
		oos2.flush();
		oos2.writeObject(new J265_Person("Kai", 20));
		oos2.flush();
		oos2.close();
		// 反序列化
		ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("J265_serializabletest_info2.dat"));
		Object obj2 = ois2.readObject();
		String str2 = (String) obj2;
		System.out.println(str2);
		J265_Person p = (J265_Person) ois2.readObject();
		System.out.println(p);
		ois2.close();

		Path path1 = Paths.get("c:\\temp\\company\\Finance\\salary.dat");
		Path path2 = Paths.get("salary.dat");
		System.out.println("getFileName    -> " + path1.getFileName());
		System.out.println("getParent      -> " + path1.getParent());
		System.out.println("getNameCount   -> " + path1.getNameCount());
		System.out.println("subPath(0,2)   -> " + path1.subpath(0, 2));
		System.out.println("isAbsolute     -> " + path1.isAbsolute());
		System.out.println("toAbsolutePath -> " + path1.toAbsolutePath());
		System.out.println("toAbsolutePath -> " + path2.toAbsolutePath());
		System.out.println("toUri          -> " + path1.toUri());

		Path path3 = Paths.get("c:\\temp\\company\\Finance\\salary.dat");
		Path path4 = Paths.get("c:\\temp\\company\\..\\Finance\\salary.dat").normalize();
		System.out.println(path4);
		// 路徑結合 resolve()
		Path path5 = Paths.get("c:\\temp\\company\\");
		Path path6 = Paths.get("salary.dat");
		Path path7 = Paths.get("\\salary.txt");
		System.out.println(path5.resolve(path6));
		System.out.println(path5.resolve(path7));
		// 比較頭尾是否相同startsWith/endsWith
		Path path8 = Paths.get("c:\\temp");
		System.out.println(path3.startsWith(path8));
		System.out.println(path3.endsWith(path6));

	}

}

// 若沒有實作Serializable是無法序列化
class J265_Person implements Serializable {
	static final long serialVersionUID = 1234567842L;
	// 不想序列化的欄位前加上 transient
	private String name;
	private int age;

	public J265_Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public J265_Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
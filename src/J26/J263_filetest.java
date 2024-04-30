package J26;

import java.io.File;
import java.io.FileReader;
import java.util.Date;

public class J263_filetest {

	public static void main(String[] args) throws Exception {
		File file1 = new File("J263_filetest_abc1.txt");// 建立在目前專案// 相對路徑
		File file2 = new File("C:" + File.separator + "IMPROVEMYSELF" + File.separator + "Java_Training"
				+ File.separator + "ocp819" + File.separator + "J263_filetest_abc2.txt");// 絕對路徑
		File file3 = new File("C:\\IMPROVEMYSELF\\Java_Training\\ocp819\\J263_filetest_abc3.txt");// 絕對路徑
		file1.createNewFile();
		file2.createNewFile();
		file3.createNewFile();

		File file4 = new File("C:\\IMPROVEMYSELF\\Java_Training\\ocp819", "\\J263_test");
		file4.mkdir();
		// public File(File parent,String child)//父類別為File類
		File file5 = new File(file4, "J263_filetest_abc4.txt");
		file5.createNewFile();

		File f1 = new File("J263_filetest_hello1.txt");
		File f2 = new File("C:\\IMPROVEMYSELF\\Java_Training\\ocp819\\J263_filetest_hello2.txt");
		File f3 = new File("C:\\Windows");
		System.out.println(f1.getAbsoluteFile());
		System.out.println(f1.getPath());
		System.out.println(f1.getName());
		System.out.println(f1.getParent());
		System.out.println(f1.length());
		System.out.println(f1.lastModified());
		System.out.println(new Date(f1.lastModified()));
		System.out.println(f2.getAbsoluteFile());
		System.out.println(f2.getPath());
		System.out.println(f2.getName());
		System.out.println(f2.getParent());
		System.out.println(f2.length());
		System.out.println(f2.lastModified());// 預設 0
		System.out.println(new Date(f2.lastModified()));
		System.out.println("============================");
		String[] d = f3.list();
		for (String x : d)
			System.out.println(x);
		System.out.println("============================");
		File[] files = f3.listFiles();
		for (File x : files)
			System.out.println(x);
		// f1需存在,但f4不能存在
		File f4 = new File("C:\\IMPROVEMYSELF\\Java_Training\\ocp819\\J263_filetest_hello3.txt");
		boolean b = f1.renameTo(f4);
		System.out.println(b);

		File f5 = new File("J263_filetest_abc1.txt");
		System.out.println(f5.isDirectory());// false
		System.out.println(f5.isFile());// true
		System.out.println(f5.exists());// true
		System.out.println(f5.canRead());// true
		System.out.println(f5.canWrite());// true
		System.out.println(f5.isHidden());// false

		File f6 = new File("J263_filetest_abc5.txt");
		if (!f6.exists()) {
			f6.createNewFile();
			System.out.println("檔案建立成功");
		} else {
			f6.delete();
			System.out.println("檔案刪除成功");
		}
		// 建立資料夾
		File f7 = new File("C:\\IMPROVEMYSELF\\Java_Training\\ocp819\\J263_file");
		if (!f7.exists()) {
			if (f7.mkdirs()) {// 嚐試改成mkdirs
				System.out.println("資料夾建立成功");
			} else {
				System.out.println("error");
			}
		} else {
			f7.delete();
			System.out.println("資料夾刪除成功");
		}

	}

}

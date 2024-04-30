package J26;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class J264_fileio {

	public static void main(String[] args) throws Exception {
		// 方式一
		// 1.File類的實體化
		File file1 = new File("J263_filetest_hello4.txt");
		// 2.資料流的實體化
		FileReader fr1 = new FileReader(file1);
		// 3.資料流的操作
		int read1;
		while ((read1 = fr1.read()) != -1)
			System.out.print((char) read1);
		System.out.println();
		// 4.資料流的關閉
		fr1.close();

		// 方式二
		FileReader fr2 = null;
		try {
			// 1.File類的實體化
			File file2 = new File("J263_filetest_hello4.txt");
			// 2.資料流的實體化
			fr2 = new FileReader(file2);
			// 3.資料流的操作
			int read2;
			while ((read2 = fr2.read()) != -1)
				System.out.print((char) read2);
			System.out.println();
			// 4.資料流的關閉
		} catch (Exception e) {
		} finally {
			try {
				fr2.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// 方式三
		try (FileReader fr3 = new FileReader("J263_filetest_hello4.txt")) {// try-with-resource
			int read3;
			while ((read3 = fr3.read()) != -1)
				System.out.print((char) read3);
			System.out.println();
		} catch (Exception e) {
		}

		// 方式四
		File file4 = new File("J263_filetest_hello4.txt");
		FileReader fr4 = new FileReader(file4);
		char charBuffer4[] = new char[5];
		int len4 = 0;
		while ((len4 = fr4.read(charBuffer4)) != -1) {
			for (int i = 0; i < charBuffer4.length; i++)
				System.out.print(charBuffer4[i]);
		}
		System.out.println();

		// 輸出
		File file5 = new File("J263_filetest_hello5.txt");
		FileWriter fw5 = new FileWriter(file5);
		fw5.write("今天天氣很好\n");
		fw5.write("OCP PASS");
		fw5.close();

		// 字元流 -> file
		long startTime1 = System.currentTimeMillis();
		File fileSrc = new File("J263_filetest_hello5.txt");
		File fileDest = new File("J263_filetest_hello6.txt");
		FileReader fr6 = new FileReader(fileSrc);
		FileWriter fw6 = new FileWriter(fileDest);
		char[] charBuffer6 = new char[3];
		int len6;
		while ((len6 = fr6.read(charBuffer6)) != -1) {
			String str = new String(charBuffer6, 0, len6);
			fw6.write(str);
		}
		fr6.close();
		fw6.close();
		long endTime1 = System.currentTimeMillis();
		System.out.println("totalTime1 : " + (endTime1 - startTime1));

		// 位元流 -> picture or video
		long startTime2 = System.currentTimeMillis();
		File fs = new File("J264_fileio_deadpool1.jpg");
		File fd = new File("J264_fileio_deadpool2.jpg");
		FileInputStream fis = new FileInputStream(fs);
		FileOutputStream fos = new FileOutputStream(fd);
		byte[] bsBuffer = new byte[5];
		int len;
		while ((len = fis.read(bsBuffer)) != -1) {
			fos.write(bsBuffer, 0, len);
		}
		fis.close();
		fos.close();
		long endTime2 = System.currentTimeMillis();
		System.out.println("totalTime2 : " + (endTime2 - startTime2));

		// 處理流 -> picture or video
		long startTime3 = System.currentTimeMillis();
		File fileOpen = new File("J264_fileio_deadpool1.jpg");
		File fileWrite = new File("J264_fileio_deadpool2.jpg");
		FileInputStream in = new FileInputStream(fileOpen);
		FileOutputStream out = new FileOutputStream(fileWrite);
		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		int data;
		byte buff[] = new byte[1024];
		while ((data = bin.read(buff)) != -1) {
			bout.write(buff, 0, data);
		}
		bout.close();
		bin.close();
		long endTime3 = System.currentTimeMillis();
		System.out.println("totalTime3 : " + (endTime3 - startTime3));

	}

}

/**
 * 
 */
package day03_homework2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author: 陈骏贤
 * @date: 2020年9月19日
 * @version:
 * @Description:
 */
public class CopyFile1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileSrc = "D:\\Eclipse-java2\\ibm\\src\\day03_homework2\\myfile.txt";
		String fileDes = "D:\\Eclipse-java2\\ibm\\src\\day03_homework2\\myfile_cp.txt";
		InputStream fis = null; // 声明输入流对象
		OutputStream fos = null; // 声明输出流对象
		try {
			fis = new FileInputStream(fileSrc);
			fos = new FileOutputStream(fileDes);
			long num = 0; // 读取字节计数
			int bt = 0; // 每次读入字节内容
			// 当读入文件末尾时，读入数据的值为-1，每次读入一个字节，存放变量bt中，直到读完整个文件
			while ((bt = fis.read()) != -1) {
				// 以字母的形式逐个输出文件的每个字节
				fos.write(bt); // 将字节写入输出流中，实现copy功能
				num++;
			}
			System.out.println("读取的字节数为" + num + "\n 文件复制成功");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

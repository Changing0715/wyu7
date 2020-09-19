/**
 * 
 */
package day03_homework3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: 陈骏贤
 * @date: 2020年9月19日
 * @version:
 * @Description:
 */
public class CopyFile2 {

	/**
	 * @param args
	 */
    public static void copyFile(String src,String dest) throws IOException{
        FileInputStream in=new FileInputStream(src);
        File file=new File(dest);
        if(!file.exists())
            file.createNewFile();
        FileOutputStream out=new FileOutputStream(file);
        int c;
        byte buffer[]=new byte[1024];
        while((c=in.read(buffer))!=-1){
            for(int i=0;i<c;i++)
                out.write(buffer[i]);        
        }
        in.close();
        out.close();
    }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileSrc = "D:\\Eclipse-java2\\ibm\\src\\day03_homework2\\myfile.txt";
		String fileDes = "D:\\Eclipse-java2\\ibm\\src\\day03_homework2\\myfile_cp2.txt";
	     copyFile(fileSrc,fileDes);
	     System.out.println("文件夹文件复制成功");
	}

}

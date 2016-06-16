package cn.edu.hit;
import java.io.*;

/**
 * 可以用来向指定文件名的文件中进行写入内容
 * @author zengli
 * @date 2016/5/18
 */
public class TestPrintStream1 {
	public static void main(String[] args) {
		PrintStream ps = null;
		try{
			FileOutputStream fos = new FileOutputStream("E:/Program Files/MyEclipseWorkspace/SXTTest/src/cn/edu/hit/TestPrintStream1.txt");
	        ps = new PrintStream(fos);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		//将输出out重新设置为指向打印流对象ps的输出，即向ps指向的文件进行输出。
		if(ps!=null){
			System.setOut(ps);
		}	
		System.out.println("这是一个测试打印流的文件！");
		int len = 0;
		for(char c = 0;c <= 60000;c++){
			System.out.print(c+" ");
			while(len++ >=100){
				System.out.println();
				len = 0;
			}
		}
		
	}
}

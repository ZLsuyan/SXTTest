package cn.edu.hit;
import java.io.*;

public class TestPrintStream2 {
	public static void main(String[] args) {
		String filename = "E:/Program Files/MyEclipseWorkspace/SXTTest/src/cn/edu/hit/TestPrintStream1.java";
		if(filename!=null){
			listContent(filename,System.out);
		}
	}
	
	public static void listContent(String f,PrintStream ps){
		try{
			//BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
			BufferedReader br = new BufferedReader(new FileReader(f));
			String s = null;
			while((s = br.readLine())!=null){
				ps.println(s);
			}
			br.close();
		}catch(IOException e){
			ps.println("无法读取文件");
		}
	}
}


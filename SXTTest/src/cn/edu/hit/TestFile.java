package cn.edu.hit;
import java.io.File;
import java.io.IOException;

/**
 * 文件类File测试
 * @author zengli
 * @date 2016/5/9
 */
public class TestFile {
	public static void main(String[] args) {
		String separator = File.separator;
		String dictionary1 = "E:"+separator+"Program Files"+separator+"Workspace"+separator+"SXTTest";
		/*
		 * 注意："/"在windows和linux平台下都可以作为分隔符，
		 *      但是"\"只能适用于windows平台，
		 *      然而在java语言中，"\"是作为转义字符，
		 *      因此想要用反斜杠"\"，必须写成"\\"，
		 *      但是这样写又不适合于linux平台了，因此这种写法是反对的。
		 */
		//String dictionary = "E:/Program Files/Workspace/SXTTest";    //"/"在windows和linux下都可作为分隔符
		String filename1 = "FileTest.doc";
		File file1 = new File(dictionary1,filename1);
		if(file1.exists()){
			System.out.println("文件的绝对路径："+file1.getAbsolutePath());
			System.out.println("文件大小："+file1.length());
			System.out.println("文件名："+file1.getName());
			/*
			 * 当class文件位于某个包下面的时候，
			 * 找它的上层路径时，先找它的包再找它的上层路径
			 * 因为找的是它最上层包的上层路径
			 */
			System.out.println("上层路径："+file1.getParent());
			System.out.println("最近一次修改距离特定时间的ms数："+file1.lastModified()+" ms.");
			System.out.println("是文件吗？："+file1.isFile());
			System.out.println();
		}else{
			//mkdir()创建单个目录，mkdirs()创建一系列目录
			file1.getParentFile().mkdirs();
			try{
				file1.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
		
		
		String dictionary2 = "mydir1"+separator+"mydir2";
		String filename2 = "FileTest.txt";
		File file2 = new File(dictionary2,filename2);
		if(file2.exists()){
			System.out.println("文件的绝对路径："+file2.getAbsolutePath());
			System.out.println("文件大小："+file2.length());
			System.out.println("文件名："+file2.getName());
			System.out.println("父路径："+file2.getParent());
			System.out.println("最近一次修改距离特定时间的ms数："+file2.lastModified()+" ms.");
			System.out.println("是目录吗？："+file2.isDirectory());
		}else{
			file2.getParentFile().mkdirs();
			try{
				file2.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
		
	}
}

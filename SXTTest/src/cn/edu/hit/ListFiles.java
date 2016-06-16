package cn.edu.hit;

import java.io.File;

public class ListFiles {
	public static void main(String[] args) {
		File filename = new File("E:/A");
		tree(filename,0);
	}
	

	private static void tree(File filename,int level){
		String preStr = "";
		for(int i=0;i<level;i++){
			preStr += "      ";
		}
		
		File[] childs = filename.listFiles();
		for(int i=0;i<childs.length;i++){
			System.out.println(preStr+childs[i].getName());
			if(childs[i].isDirectory()){
				tree(childs[i],level+1);
			}
		}
	}
}

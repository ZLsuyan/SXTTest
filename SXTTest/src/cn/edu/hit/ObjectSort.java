package cn.edu.hit;

import java.util.Scanner;

/**
 * 对对象进行排序
 * @author zengli
 * @date 2016/5/6
 */
public class ObjectSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入5个年月日，每个年月日之间用空格分开:");
		String str = scan.nextLine() ;
		scan.close();
		//将键盘输入的字符串按空格（可以是多个空格）隔开，并定义一个字符串数组a也指向它
		String[] a = str.split("\\s+") ;
		//将字符串数组转换成整型数组
		int[] result = new int[a.length] ;
		for(int i = 0 ; i < a.length ; i ++){
			result[i] = Integer.parseInt(a[i]);
		//	System.out.print(result[i]+" ");
		}	
		System.out.println();	
		
		Date[] dates = new Date[5]; 
		for(int i=0;i<dates.length;i++){
			dates[i] = new Date();
		//	System.out.println(dates[i].year+" "+dates[i].month+" "+dates[i].day);
		}
		
		int j = -1;
		for(int i=0;i<result.length;i+=3){
			if(i%3==0){
				j++;
				try{
					dates[j].year = result[i];
					dates[j].month = result[i+1];
					dates[j].day = result[i+2];
				}catch(NullPointerException e){
					e.printStackTrace();
				}			
			}
		}
		System.out.println("排序之前：");
		for(int i=0;i<dates.length;i++){
			System.out.println(dates[i]);
		}
		
		Date temp = new Date();
		for(int i=0;i<dates.length;i++){
			int k = i;
			for(int t=k+1;t<dates.length;t++){
				if(dates[k].compare(dates[t])==1){
					k = t;
				}
			}
			if(k!=i){
				temp = dates[k];
				dates[k] = dates[i];
				dates[i] = temp;
			}
		}
		System.out.println();
		System.out.println("排序之后：");
		for(int i=0;i<dates.length;i++){
			System.out.println(dates[i]);
		}
		
	}
}


class Date{
	int year,month,day;
	Date(){
		year = 0;
		month = 0;
		day = 0;
	}
	Date(int y,int m,int d){
		this.year = y;
		this.month = m;
		this.day = d;
	}
	
	//对象的比较方法
	public int compare(Date date){
		if(this.year>date.year){
			return 1;
		}else if(this.year<date.year){
			return -1;
		}else if(this.month>date.month){
			return 1;
		}else if(this.month<date.month){
			return -1;
		}else if(this.day>date.day){
			return 1;
		}else if(this.day<date.day){
			return -1;
		}else{
			return 0;
		}
	}
	
	public String toString(){
		return "年-月-日："+year+"-"+month+"-"+day;
	}
}
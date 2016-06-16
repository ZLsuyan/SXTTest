package cn.edu.hit;

import java.util.Scanner;

/**
 * �Զ����������
 * @author zengli
 * @date 2016/5/6
 */
public class ObjectSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������5�������գ�ÿ��������֮���ÿո�ֿ�:");
		String str = scan.nextLine() ;
		scan.close();
		//������������ַ������ո񣨿����Ƕ���ո񣩸�����������һ���ַ�������aҲָ����
		String[] a = str.split("\\s+") ;
		//���ַ�������ת������������
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
		System.out.println("����֮ǰ��");
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
		System.out.println("����֮��");
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
	
	//����ıȽϷ���
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
		return "��-��-�գ�"+year+"-"+month+"-"+day;
	}
}
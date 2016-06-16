package cn.edu.hit;
import java.util.Scanner;

/**
 * 利用普通的数组的方法，求出500个手拉手围成圈的小孩逢三退一的最后的圈里剩的小孩的数组的下标
 * @author zengli
 * @date 2016/5/6
 */
public class Count3Quit {
	public void index(boolean[] arr){
		int leftCount = arr.length;
		int countNum = 0;
		int index = 0;         //第几个位置
		
		while(leftCount>1){
			if(arr[index]==true){
				countNum++;
			}
			if(countNum==3){
				countNum = 0;
				leftCount--;
				arr[index]= false;
			}
			
			index++;
			if(index==arr.length){
				index = 0;
			}
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==true){
				System.out.println("最后剩下的那个人的数组下标为："+i+"，即第"+(i+1)+"个人");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		boolean[] arr = new boolean[N]; 
		for(int i=0;i<arr.length;i++){
			arr[i] = true;
		}
		
		Count3Quit cq = new Count3Quit();
		cq.index(arr);

	}
}

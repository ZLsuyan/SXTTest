package cn.edu.hit;
import java.util.Scanner;

/**
 * ������ͨ������ķ��������500��������Χ��Ȧ��С��������һ������Ȧ��ʣ��С����������±�
 * @author zengli
 * @date 2016/5/6
 */
public class Count3Quit {
	public void index(boolean[] arr){
		int leftCount = arr.length;
		int countNum = 0;
		int index = 0;         //�ڼ���λ��
		
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
				System.out.println("���ʣ�µ��Ǹ��˵������±�Ϊ��"+i+"������"+(i+1)+"����");
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

package cn.edu.hit;

/**
 * ����main()�����е�String[] args
 * ����java������:java ����  [324 ghfu 54 se3 45]
 * ��������������ľ�����Ϊargs�ַ��������е�Ԫ�����뵽args�������ˣ�
 * ���args[0] = "324"��args[1]  = "ghfu"��������ȥ...
 * @author zengli
 * @date 2016/5/6
 */
public class TestArgsArray {
	public static void main(String[] args){
		int k,temp;
		int[] a = new int[args.length];
		for(int i=0;i<a.length;i++){
			//��String��������Integer��װ��ת��Ϊint����
			a[i] = Integer.parseInt(args[i]);
		}
		
		
		//ѡ������
		for(int i=0;i<a.length;i++){
			k = i;
			for(int j=k+1;j<a.length;j++){
				if(a[k]>a[j]){
					k=j;
				}
			}
			if(k!=i){
				temp = a[k];
				a[k] = a[i];
				a[i] = temp;
			}
		}
		
		//��������
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}

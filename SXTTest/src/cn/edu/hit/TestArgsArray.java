package cn.edu.hit;

/**
 * 测试main()方法中的String[] args
 * 利用java命令行:java 类名  [324 ghfu 54 se3 45]
 * 后面中括号里面的就是作为args字符串数组中的元素输入到args数组中了，
 * 因此args[0] = "324"，args[1]  = "ghfu"，依次下去...
 * @author zengli
 * @date 2016/5/6
 */
public class TestArgsArray {
	public static void main(String[] args){
		int k,temp;
		int[] a = new int[args.length];
		for(int i=0;i<a.length;i++){
			//将String类型利用Integer包装类转换为int类型
			a[i] = Integer.parseInt(args[i]);
		}
		
		
		//选择排序
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
		
		//排序后输出
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}

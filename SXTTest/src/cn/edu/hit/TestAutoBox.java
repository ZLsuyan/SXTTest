package cn.edu.hit;
import java.util.*;
public class TestAutoBox {
	private static final Integer ONE = new Integer(1);
	public static void main(String[] args) {
		String[] A = {"aaa","bbb","aaa","ccc","bbb"};
		Map m = new HashMap();
		for(int i=0;i<A.length;i++){
			Integer freq = (Integer)m.get(A[i]);
			m.put(A[i], freq==null? ONE: new Integer(freq.intValue()+1));
		}
		System.out.println(m.size());
		/*
		 * HashMap中的toString()方法是从java.util.AbstractMap继承的，
		 * 而java.util.AbstractMap是重写了Object中的toSring()方法的。
		 * 按以下格式输出{K1==V1,K2 ==V2, ....  }
		 */
		System.out.println(m);
	}
}

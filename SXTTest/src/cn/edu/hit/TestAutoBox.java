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
		 * HashMap�е�toString()�����Ǵ�java.util.AbstractMap�̳еģ�
		 * ��java.util.AbstractMap����д��Object�е�toSring()�����ġ�
		 * �����¸�ʽ���{K1==V1,K2 ==V2, ....  }
		 */
		System.out.println(m);
	}
}

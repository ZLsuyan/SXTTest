package cn.edu.hit;

import java.lang.reflect.Method;

/**
 * Java ������ϰ��
 * getMethod�����ĵ�һ����������Ҫ���õķ����ķ�������
 *                �ڶ��������Ǵ˷����Ĳ������ͣ�
 *                ����Ƕ��������������Ӳ����Ϳ����ˡ�
 * 
 * invoke�����ĵ�һ������������Ҫ���õ���Ķ������������һ������Ҳ���ǵ���������ĸ������һ�����巽����
 *             �ڶ��������Ǹ�����������ݵĲ���
 * @author zengli
 * @date 2016/5/24
 */
public class TestReflect {

    private static final Class[] String = null;

	/**
     * ��ں�����
     * 
     * @param args
     *            ����
     * @throws Exception
     *             ������Ϣ
     */
    public static void main(String[] args) throws Exception {
        // ���Class
        Class cls = Class.forName(args[0]);
        
        /*
         *  ͨ��Class�������Ӧ����ķ���.
         */
        Method[] methods = cls.getMethods();
        
        // ���ÿ��������
        for (int i = 0 ;i < methods.length;i ++) {
            System.out.println(methods[i]);
        }
       
    }
}


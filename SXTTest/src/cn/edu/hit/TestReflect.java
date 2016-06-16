package cn.edu.hit;

import java.lang.reflect.Method;

/**
 * Java 反射练习。
 * getMethod方法的第一个参数是想要调用的方法的方法名，
 *                第二个参数是此方法的参数类型，
 *                如果是多个参数，接着添加参数就可以了。
 * 
 * invoke方法的第一个参数，是想要调用的类的对象所属的类的一个对象，也就是调用这个类哪个对象的一个具体方法，
 *             第二个参数是给这个方法传递的参数
 * @author zengli
 * @date 2016/5/24
 */
public class TestReflect {

    private static final Class[] String = null;

	/**
     * 入口函数。
     * 
     * @param args
     *            参数
     * @throws Exception
     *             错误信息
     */
    public static void main(String[] args) throws Exception {
        // 获得Class
        Class cls = Class.forName(args[0]);
        
        /*
         *  通过Class获得所对应对象的方法.
         */
        Method[] methods = cls.getMethods();
        
        // 输出每个方法名
        for (int i = 0 ;i < methods.length;i ++) {
            System.out.println(methods[i]);
        }
       
    }
}


package GUI;
import java.awt.*;

/**
 * 设计多种不同背景样色的Frame窗口
 * @author zengli
 * @date 2016/5/19
 */
public class TestMultiFrame {
	public static void main(String[] args) {
		MyFrame f1 = new MyFrame(100,100,200,200,Color.cyan);
		MyFrame f2 = new MyFrame(200,100,200,200,Color.red);
		MyFrame f3 = new MyFrame(100,300,200,200,Color.green);
		MyFrame f4 = new MyFrame(300,300,200,200,Color.pink);
	}
}

class MyFrame extends Frame{
	//静态id，属于类的，不属于某个特定的对象
	static int id = 0;
	//子类的构造方法
	MyFrame(int x,int y,int w,int h,Color c) {
		//调用父类Frame的构造方法
		super("MyFrame"+(++id));
		setBackground(c);
		//把它自己的内部的布局管理器设为空
		setLayout(null);
		//设置窗口显示的初始位置
		setBounds(x,y,w,h);
		setVisible(true);
	}
}

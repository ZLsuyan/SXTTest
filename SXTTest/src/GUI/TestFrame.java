package GUI;
import java.awt.*;

/**
 * 写第一个简单地Frame窗口程序
 * @author zengli
 * @date 2016/5/19
 */
public class TestFrame {
	public static void main(String[] args) {
		//构造函数中可设置标题
		Frame f = new Frame("My First Frame!");
		f.setLocation(300,300);
		//设置像素
		f.setSize(500, 300);
		f.setBackground(Color.pink);
		//是否可见
		f.setVisible(true);
		//是否可调整大小
		f.setResizable(true);
	}
}

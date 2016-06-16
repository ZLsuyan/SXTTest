package GUI;
import java.awt.*;

/**
 * 一个Frame中有多个Panel嵌入框
 * @author zengli
 * @date 2016/5/19
 */
public class TestMultiPanel {
	public static void main(String[] args) {
		new MyFrame2("Frame with MultiPanel",300,180,600,600);
	}
}

class MyFrame2 extends Frame {
	private Panel p1,p2,p3,p4;
	MyFrame2(String s,int x,int y,int w,int h) {
		super(s);
		setLayout(null);
		setBounds(x,y,w,h);
		p1 = new Panel(null);
		p2 = new Panel(null);
		p3 = new Panel(null);
		p4 = new Panel(null);
		p1.setBounds(0,0,w/2,h/2);
		p2.setBounds(w/2,0,w/2,h/2);
		p3.setBounds(0,h/2,w/2,h/2);
		p4.setBounds(w/2,h/2,w/2,h/2);
		p1.setBackground(Color.black);
		p2.setBackground(Color.pink);
		p3.setBackground(Color.gray);
		p4.setBackground(Color.green);
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		setVisible(true);
	}
}
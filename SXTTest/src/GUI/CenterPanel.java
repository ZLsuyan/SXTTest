package GUI;
import java.awt.*;

/**
 * 实现Panel位于Frame中间
 * @author zengli
 * @date 2016/5/19
 */
public class CenterPanel {
	public static void main(String[] args) {
		new MyFrame3("Center Panel",250,180,500,400,Color.blue,Color.yellow);
	}
}

class MyFrame3 extends Frame {
	private Panel p;
	MyFrame3(String s,int x,int y,int w,int h,Color c,Color c2) {
		super(s);
		setLayout(null);
		setBounds(x,y,w,h);
		setBackground(c);
		
		p = new Panel(null);
		p.setBackground(c2);
		p.setBounds(w/4, h/4, w/2, h/2);
		add(p);
		setVisible(true);
	}
}
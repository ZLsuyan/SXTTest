package GUI;
import java.awt.*;

/**
 * Frame with PanelµÄÐ´·¨
 * @author zengli
 * @date 2016/5/19
 */
public class TestPanel {
	public static void main(String[] args) {
		Frame f = new Frame("MyFrame with Panel");
		Panel p = new Panel(null);
		f.setLayout(null);
		f.setBounds(300, 300, 500, 500);
		f.setBackground(Color.white);
		
		p.setBounds(50, 50, 200, 200);
		p.setBackground(Color.pink);
		f.add(p);
		f.setVisible(true);
	}
}

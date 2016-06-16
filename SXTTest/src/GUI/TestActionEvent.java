package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 测试动作事件
 * 每一个Component图形元素都可以添加事件监听对象。
 * ActionEvent对应ActionListener事件监听接口，拥有addActionListener(ActionListener a)方法；
 * MouseEvent 对应MouseListener 鼠标监听接口，拥有addMouseListener(MouseListener m)  方法；
 * WindowEvent对应WindowListener窗口监听接口，拥有addWindowListener(WindowListener w)方法；
 * 依此下去......，每一种事件都会对应一个事件监听接口，每一个图形元素都拥有对应事件的添加监听对象的方法。
 * @author zengli
 * @date 2016/5/20
 */
public class TestActionEvent {
	public static void main(String[] args) {
		Frame f = new Frame("ActionListener");
		Button b = new Button("Press me!");
		f.add(b, BorderLayout.CENTER);
		
		Monitor m = new Monitor();
		//每一个Component图形元素（例如Button b）都可以添加事件监听（例如动作监听）对象（例如实现了动作监听接口的Monitor类的对象m）。
		b.addActionListener(m);
		f.pack();
		f.setVisible(true);
	}
}

class Monitor implements ActionListener {
	/*
	 * ActionListener事件监听接口，拥有唯一的一个方法。
	 */
	public void actionPerformed(ActionEvent e){
		System.out.println("Press me success!");
	}
}
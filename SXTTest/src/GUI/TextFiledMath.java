package GUI;
import java.awt.*;
import java.awt.event.*;

/**
 * 非常非常典型的用法：持有对方的引用
 * @author zengli
 * @date 2016/5/19
 */
public class TextFiledMath {
	 public static void main(String[] args) {
		new TFFrame().launchFrame();
	}
	 
}


class TFFrame extends Frame {
	TextField num1,num2,num3;
	public void launchFrame() {
		//设置TextField的字符是多少个字符宽
		num1 = new TextField(10);
		num2 = new TextField(10);
		num3 = new TextField(15);
		//显示静态的文本标签
		Label lp = new Label("+");
		Button btnEqual = new Button("=");
		
		/***********************************
		 * this将当前对象传进去
		 ***********************************/
		btnEqual.addActionListener(new MyMonitor());
		setLayout(new FlowLayout());
		add(num1);
		add(lp);
		add(num2);
		add(btnEqual);
		add(num3);
		pack();
		setVisible(true);
	}
	
	/**
	 * 注意：内部类可以非常方便的访问外面包装类的成员变量或成员方法.
	 *       内部类编译出来是【外部包装类名$内部类名.class】：
	 *       在这里也就是这个内部类编译出来的class文件名为：TFFrame$MyMonitor.class。
	 * 何时使用：当该类不允许或不需要其它类进行访问时。
	 */
	private class MyMonitor implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			num3.setText(String.valueOf(n1+n2));
		}
	}
}

//class MyMonitor implements ActionListener {
////	TextField num1,num2,num3;
////	public MyMonitor(TextField num1,TextField num2,TextField num3) {
////		this.num1 = num1;
////		this.num2 = num2;
////		this.num3 = num3;
////	}
//	
//	/***********************************
//	 * 非常非常典型的用法：持有对方的引用
//	 ***********************************/
//	TFFrame tf = null;
//	
//	public MyMonitor(TFFrame tf){
//		this.tf = tf;
//	}
//	
//	public void actionPerformed(ActionEvent e) {
//		int n1 = Integer.parseInt(tf.num1.getText());
//		int n2 = Integer.parseInt(tf.num2.getText());
//	//	int result = n1+n2;
//	//	tf.num3.setText(String.valueOf(result));
//		tf.num3.setText(""+(n1+n2));
//		
//	}
//	
//	
//}
package GUI;
import java.awt.*;
import java.awt.event.*;

/**
 * �ǳ��ǳ����͵��÷������жԷ�������
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
		//����TextField���ַ��Ƕ��ٸ��ַ���
		num1 = new TextField(10);
		num2 = new TextField(10);
		num3 = new TextField(15);
		//��ʾ��̬���ı���ǩ
		Label lp = new Label("+");
		Button btnEqual = new Button("=");
		
		/***********************************
		 * this����ǰ���󴫽�ȥ
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
	 * ע�⣺�ڲ�����Էǳ�����ķ��������װ��ĳ�Ա�������Ա����.
	 *       �ڲ����������ǡ��ⲿ��װ����$�ڲ�����.class����
	 *       ������Ҳ��������ڲ�����������class�ļ���Ϊ��TFFrame$MyMonitor.class��
	 * ��ʱʹ�ã������಻�������Ҫ��������з���ʱ��
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
//	 * �ǳ��ǳ����͵��÷������жԷ�������
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
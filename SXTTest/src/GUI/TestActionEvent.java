package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ���Զ����¼�
 * ÿһ��Componentͼ��Ԫ�ض���������¼���������
 * ActionEvent��ӦActionListener�¼������ӿڣ�ӵ��addActionListener(ActionListener a)������
 * MouseEvent ��ӦMouseListener �������ӿڣ�ӵ��addMouseListener(MouseListener m)  ������
 * WindowEvent��ӦWindowListener���ڼ����ӿڣ�ӵ��addWindowListener(WindowListener w)������
 * ������ȥ......��ÿһ���¼������Ӧһ���¼������ӿڣ�ÿһ��ͼ��Ԫ�ض�ӵ�ж�Ӧ�¼�����Ӽ�������ķ�����
 * @author zengli
 * @date 2016/5/20
 */
public class TestActionEvent {
	public static void main(String[] args) {
		Frame f = new Frame("ActionListener");
		Button b = new Button("Press me!");
		f.add(b, BorderLayout.CENTER);
		
		Monitor m = new Monitor();
		//ÿһ��Componentͼ��Ԫ�أ�����Button b������������¼����������綯����������������ʵ���˶��������ӿڵ�Monitor��Ķ���m����
		b.addActionListener(m);
		f.pack();
		f.setVisible(true);
	}
}

class Monitor implements ActionListener {
	/*
	 * ActionListener�¼������ӿڣ�ӵ��Ψһ��һ��������
	 */
	public void actionPerformed(ActionEvent e){
		System.out.println("Press me success!");
	}
}
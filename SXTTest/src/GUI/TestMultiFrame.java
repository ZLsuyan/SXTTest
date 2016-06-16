package GUI;
import java.awt.*;

/**
 * ��ƶ��ֲ�ͬ������ɫ��Frame����
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
	//��̬id��������ģ�������ĳ���ض��Ķ���
	static int id = 0;
	//����Ĺ��췽��
	MyFrame(int x,int y,int w,int h,Color c) {
		//���ø���Frame�Ĺ��췽��
		super("MyFrame"+(++id));
		setBackground(c);
		//�����Լ����ڲ��Ĳ��ֹ�������Ϊ��
		setLayout(null);
		//���ô�����ʾ�ĳ�ʼλ��
		setBounds(x,y,w,h);
		setVisible(true);
	}
}

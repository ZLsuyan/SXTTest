package GUI;
import java.awt.*;

/**
 * д��һ���򵥵�Frame���ڳ���
 * @author zengli
 * @date 2016/5/19
 */
public class TestFrame {
	public static void main(String[] args) {
		//���캯���п����ñ���
		Frame f = new Frame("My First Frame!");
		f.setLocation(300,300);
		//��������
		f.setSize(500, 300);
		f.setBackground(Color.pink);
		//�Ƿ�ɼ�
		f.setVisible(true);
		//�Ƿ�ɵ�����С
		f.setResizable(true);
	}
}

package mine_clearance;

import java.awt.Container;
import javax.swing.JFrame;
//container ����һ�����Է�������������䱾��Ҳ�����ࡣ
//JFrame�Ǵ��ڣ����������������С����ť�ȵȣ���container�����е������
//һ����˵JFrame��getContentPane�������᷵��һ���������м�����Ĵ��������Ҳ����һ��container������Ҳ��һ��JPanel����

public class Game {
	public static void main(String[] args) {
		// ����JFrame������Ϊ����
		JFrame w = new JFrame();
		// ����mainPanel����,��ʼ��һ��20*30�ķ�����
		GamePanel mainPanel = new GamePanel(20, 30);
		// ��ȡJFrameӦ�����õĿ�Ⱥ͸߶�
		int[] a = mainPanel.returnSize();
		// ����JFame��͸�
		w.setSize(a[0], a[1]);
		//����
		w.setTitle("ɨ��");
		//����ر�������˳�
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = w.getContentPane();
		c.add(mainPanel);
 
		w.setVisible(true);
	}
}	
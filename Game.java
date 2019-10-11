package mine_clearance;

import java.awt.Container;
import javax.swing.JFrame;
//container 就是一个可以放组件的容器，其本身也是子类。
//JFrame是窗口，包括标题栏最大化最小化按钮等等，而container是其中的组件。
//一般来说JFrame的getContentPane方法都会返回一个代表其中间区域的大的容器，也就是一个container对象，其也是一个JPanel对象

public class Game {
	public static void main(String[] args) {
		// 创建JFrame对象作为容器
		JFrame w = new JFrame();
		// 创建mainPanel对象,初始化一个20*30的方格窗体
		GamePanel mainPanel = new GamePanel(20, 30);
		// 获取JFrame应给设置的宽度和高度
		int[] a = mainPanel.returnSize();
		// 设置JFame宽和高
		w.setSize(a[0], a[1]);
		//标题
		w.setTitle("扫雷");
		//窗体关闭则程序退出
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = w.getContentPane();
		c.add(mainPanel);
 
		w.setVisible(true);
	}
}	
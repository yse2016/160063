import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPanelTest extends JFrame{
	public JPanelTest(){
		setSize(300,100);
		setTitle("JPanelTestのテスト");

		MyJPanel myjp = new MyJPanel();
		JLabel label = new JLabel("helloworld");
		Container c = getContentPane();
		c.add(label);	
	}
	public static void main(String[] args){
		JFrame w = new JPanelTest();
		w.show();
	}
}


class MyJPanel extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("Aloha",20,40);
	}
}
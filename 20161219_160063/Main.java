import java.awt.FlowLayout;
import javax.swing.*;

public class Main{
	public static void main(String[] args){
		JFrame frame = new JFrame("");
		JLabel label = new JLabel("Helloworld");
		JButton button = new JButton("押してれ");
		JLabel label2 = new JLabel("Aloha");
		JButton button2 = new JButton("押してね");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(button);
		frame.getContentPane().add(label);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(button2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,100);
		frame.setVisible(true);
	}
}
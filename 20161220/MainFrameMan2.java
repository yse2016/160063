import java.awt.*;
import javax.swing.*;

public class MainFrameMan2{
	public static void main(String[] args){
		FrameMan fm = new FrameMan();
	}
}

class FrameMan{
		JFrame frame = new JFrame();
		JLabel label = new JLabel("hello");
		JButton button = new JButton("Clickme");

		public FrameMan(){
		frame.setBounds(50,50,300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout( new FlowLayout());

		Container ctnr = frame.getContentPane();
		ctnr.add(label);
		ctnr.add(button);

		frame.setVisible(true);
	}
}
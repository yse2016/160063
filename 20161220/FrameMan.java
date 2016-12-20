import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameMan implements ActionListener{
		JFrame frame = new JFrame();
		JLabel label = new JLabel("hello");
		JButton button = new JButton("Clickme");

		button.addActionListener(this);

		public FrameMan(){	
		frame.setBounds(50,50,300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout( new FlowLayout());

		Container ctnr = frame.getContentPane();
		ctnr.add(label);
		ctnr.add(button);

		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		label.setText("Aloha");
	}
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrameMan2{
	public static void main(String[] args){
		FrameMan fm = new FrameMan();
	}
}

class FrameMan implements ActionListener{
		JFrame frame = new JFrame();
		JLabel label = new JLabel("hello");
		JButton button = new JButton("Clickme");
		JTextField text1 = new JTextField(15);


		public FrameMan(){	
		frame.setBounds(50,50,300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout( new FlowLayout());

		button.addActionListener(this);

		Container ctnr = frame.getContentPane();
		ctnr.add(text1);
		ctnr.add(button);
		ctnr.add(label);

		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String data = text1.getText();
		label.setText(data);
	}
}
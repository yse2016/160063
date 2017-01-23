import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Idean{
	public static void main(String[] args){
		IdeaMan im = new IdeaMan();
	}
}

class IdeaMan implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JTextArea textArea;
	public IdeaMan(){
		frame = new JFrame("TextEditor");
		frame.setLocation(400,400);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		button1 = new JButton("hello");
		button2 = new JButton("aloha");

		panel.add(button1);
		panel.add(button2);
		frame.add(panel);

		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
	}
}
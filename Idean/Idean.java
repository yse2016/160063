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
	JButton hyozi;
	JButton save;
	JTextArea textArea;
	public IdeaMan(){
		frame = new JFrame("TextEditor");
		frame.setLocation(400,400);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		hyozi = new JButton("単語２個表示");
		save = new JButton("メモを保存");
		textArea = new JTextArea(10,30);

		panel.add(hyozi);
		panel.add(save);
		panel.add(textArea);
		frame.add(panel);

		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
	}
}
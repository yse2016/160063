import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Idean{
	public static void main(String[] args){
		IdeaMan im = new IdeaMan();
	}
}

class IdeaMan{
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

		frame.setVisible(true);
	}
}
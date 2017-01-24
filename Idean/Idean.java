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
	JFileChooser fc;
	JTextField tf1;
	JTextField tf2;
	String textdata;
	public IdeaMan(){
		frame = new JFrame("TextEditor");
		frame.setLocation(400,400);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		hyozi = new JButton("単語２個表示");
		save = new JButton("メモを保存");
		textArea = new JTextArea(10,30);
		tf1 = new JTextField(15);
		tf2 = new JTextField(15);

		hyozi.addActionListener(this);
		hyozi.setActionCommand("hyozi");
		save.addActionListener(this);
		save.setActionCommand("Save");

		panel.add(hyozi);
		panel.add(save);
		panel.add(textArea);
		panel.add(tf1);
		panel.add(tf2);
		frame.add(panel);

		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();

		if(cmd.equals("hyozi")){
			fc = new JFileChooser();
			fc.setCurrentDirectory(new File("."));
			int ret = fc.showOpenDialog(frame);
			if(ret == JFileChooser.APPROVE_OPTION){
				File file = fc.getSelectedFile();

				textdata = file.getAbsolutePath();
			}
		try {
                // 1. ファイルを準備する
			File inFile = new File("data.txt");
			FileReader fr = new FileReader(inFile);
			BufferedReader br = new BufferedReader(fr);
                // 2. ファイルからデータを読み取って表示する
			String line ;
			textArea .setText("");
			while ((line=br.readLine()) != null) {
				textArea.append(line);
				textArea.append("\n");
			}             
                // 3. ファイルを閉じる
			br.close();
		} catch (IOException e) {
			System.out.println("ファイル読み取りエラー");
			e.printStackTrace();
		}
		}
	}
}
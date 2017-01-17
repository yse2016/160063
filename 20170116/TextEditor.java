import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class TextEditor{
	public static void main(String[] args){
		TextEditorMan tem = new TextEditorMan();
	}
}


class TextEditorMan implements ActionListener{
	JFrame frame;
	JTextField fileName;
	JPanel panel;
	JButton btnOpen;
	JButton btnSave;
	JTextArea textArea;
	JScrollPane scrollPane;
	public TextEditorMan(){
		frame = new JFrame("TextEditor");
		frame.setLocation(400,400);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		fileName = new JTextField("aloha",15);
		panel = new JPanel();
		panel.add(fileName);
		btnOpen = new JButton("hello");
		btnOpen.addActionListener(this);
		btnOpen.setActionCommand("Open");
		panel.add(btnOpen);
		btnSave = new JButton("aloha");
		btnSave.addActionListener(this);
		btnSave.setActionCommand("Save");
		panel.add(btnSave);

		textArea = new JTextArea(10,30);
		scrollPane = new JScrollPane(textArea);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2,1));
		con.add(panel);
		
		con.add(scrollPane);

		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();
		if(cmd.equals("Open")){
		// ファイル名をしらべる	
		String textFileName = "aloha";

		JFileChooser fc = new JFileChooser();

		fc.setCurrentDirectory(new File("."));

		int ret = fc.showOpenDialog(frame);

		if(ret == JFileChooser.APPROVE_OPTION){
			File file = fc.getSelectedFile();
			textFileName = file.getAbsolutePath();
		}

		// 必要なデータを準備する
		FileReader fr;
		BufferedReader br;

		try {
			// ファイルを開く
			fr = new FileReader(textFileName);
			br = new BufferedReader(fr);

			// データを読んで、表示する
			String data;
			while((data = br.readLine()) != null) {
				textArea.append(data + '\n');
			}
		} catch(IOException e) {
			System.out.println("IO error.");
		}
	}else if(cmd.equals("Save")){
		String textFileName = fileName.getText();
		try{
		File f = new File(textFileName);
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		String data = textArea.getText();

		pw.println(data);

		pw.close();
	}catch(Exception e){
		e.printStackTrace();
	}

		}
	}
}
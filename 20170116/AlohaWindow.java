import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class AlohaWindow{
	public static void main(String[] args){
		AlohaWindowMan awm = new AlohaWindowMan();
	}
}


class AlohaWindowMan implements ActionListener{
	JFrame frame;
	JButton btnOpen;
	JButton btnSave;
	JPanel panel;
	JTextField fileName;
	JTextArea textArea;
	JScrollPane scrollPane;

	public AlohaWindowMan(){
		frame = new JFrame("AlohaWindow");
		frame.setLocation(400,400);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnOpen = new JButton("Open");
		btnOpen.addActionListener(this);
		btnOpen.setActionCommand("Open");
		btnSave = new JButton("Save");
		btnSave.addActionListener(this);
		btnSave.setActionCommand("Save");

		fileName = new JTextField("aloha",20);

		btnOpen.addActionListener(this);

		textArea = new JTextArea(10, 30);
		scrollPane = new JScrollPane(textArea);

		fileName.setText("OPEN");
		textArea.setText("ALOHA");

		panel = new JPanel();
		panel.add(fileName);
		panel.add(btnOpen);
		panel.add(btnSave);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2,1));
		con.add(panel);
		con.add(scrollPane);

		frame.setVisible(true);
	}


	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();
		if(cmd.equals("Open")){
			FileReader fr;
			BufferedReader br;

			try{
				fr = new FileReader(fileName);
				br = new BufferedReader(fr);

		String data = br.readLine();	// １行読む
		textArea.setText(data);	// 書き込み・表示
	} catch(IOException e) {
		System.out.println("IO error.");
	}

	fileName.setText("open");
}else if(cmd.equals("Save")){
	fileName.setText("save");
}
}
}
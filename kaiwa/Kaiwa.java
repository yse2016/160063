import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Kaiwa{
    public static void main(String[] args){
        KaiwaMan ka = new KaiwaMan();
    }
}

class KaiwaMan implements ActionListener{
    // field
    JFrame frame;
    JButton btnOpen;
    JButton btnSave;
    JPanel panel;
    JPanel panel2;
    JTextField field;
    JTextArea area;
    JScrollPane scrollPane;
    String filedata;
    String textdata;
    int max = 128;
    String[] datas = new String[max];
    int co = 0;
    int num = 0;
    String t;

    public KaiwaMan(){

        frame = new JFrame("Ms.Kと話そう");
        frame.setLocation(500,250);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnOpen = new JButton("私と話しましょう");
        btnSave = new JButton("送信");

        field = new JTextField(5);
        area = new JTextArea(10,30);
        area.setLineWrap(true);

        panel = new JPanel();
        // panel.add(field);
        panel.add(btnOpen);
        panel.add(btnSave);

        scrollPane = new JScrollPane(area);

        Container con = frame.getContentPane();
        con.setLayout(new GridLayout(2,1));
        con.add(panel);
        con.add(scrollPane);
        con.add(field);

        frame.setVisible(true);

        btnOpen.addActionListener(this);
        btnOpen.setActionCommand("open");

        btnSave.addActionListener(this);
        btnSave.setActionCommand("save");
        try{
                File inFile            = new File("Kaiwa.txt");
                FileReader fr        = new FileReader(inFile);
                BufferedReader br    = new BufferedReader(fr);

                String line;
                while((line = br.readLine()) != null){
                    datas[co] = line;
                    co++;
                }

                br.close();
            } catch(IOException e){
                    System.out.println("error");
            }
        }

    public void actionPerformed(ActionEvent ae) {
        String cmd = ae.getActionCommand();
        if(cmd.equals("open")){
            num = (int)(Math.random()*co);
            area.append("\n");
            num = (int)(Math.random()*co);
            
            area.append("(Ms.K)."+datas[num]);
            area.append("\n");
            // System.out.println(num);
        }else if(cmd.equals("save")){

            area.append("(You)"+field.getText());
            area.append("\n");
            // textdata = area.getText();
            // try{
            //     File outFile            = new File("result.txt");
            //     FileWriter fw            = new FileWriter(outFile,true);
            //     BufferedWriter bw        = new BufferedWriter(fw);
            //     PrintWriter pw            = new PrintWriter(bw);

            //     pw.println(textdata);

            //     pw.close();

            // }catch(IOException e){
            //     System.out.println("error");
            // }
         }
    }
}
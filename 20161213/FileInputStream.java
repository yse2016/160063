import java.io.*;

public class ShowText{
	public static void main(String[] args){
		try{
			FileReader fr = null;
			BufferedReader br = null;
			PrintReader pr = null;
			fr = new FileReader("Data.txt");
			br = new BufferedReader(fr);
			pr = new PrintReader(br);

			String data = in.readLine();

		while(true){
		System.out.println(data);
		}

			pr.close();
		}catch(IOException e){
			Sytem.err.println(era-);
			e.printStackTrace();
		}
	}
}
import java.io.*;

public class ShowText{
	public static void main(String[] args){
		try{
			FileReader fr = null;
			BufferedReader br = null;
			fr = new FileReader("Data.txt");
			br = new BufferedReader(fr);

		for(int i = 0; i<10; i++){
		String data = br.readLine();
		System.out.println(data+","+i);
		}

			

			br.close();
		}catch(IOException e){
			System.err.println("era-");
			e.printStackTrace();
		}
	}
}
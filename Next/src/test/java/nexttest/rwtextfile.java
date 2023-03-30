package nexttest;

import java.io.FileWriter;
import java.io.IOException;

public class rwtextfile {

	public static void main(String[] args) throws IOException
	{
		FileWriter file=new FileWriter("C:\\Users\\SARUMUGAM\\Desktop\\test account dev env.txt",true);
		file.write("thursday");
		file.write("\n");
		file.write("friday");
		file.close();
		System.out.println("File edited");
		
		
	}
}

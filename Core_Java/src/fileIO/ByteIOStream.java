package fileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByteIOStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] b = new char[128];
		try
		{
			FileReader fr= new FileReader(args[0]);
			FileWriter fw=new FileWriter(args[1]);
			int count=0,read=0;
			while((read=fr.read(b))!=-1)
			{
				fw.write(b);
				count+=read;
			}
			System.out.println("Total Count: "+count+" Characters");
		}
		catch(FileNotFoundException x)
		{
			System.out.println("file: "+args[1]+" not found");
		}
		catch(IOException e)
		{
			System.out.println("IOException: "+e);
		}
	}

}

package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try
		{
			FileInputStream input = new FileInputStream("C:\\Users\\krish\\hello.txt");
			System.out.println("Data in the file");
			int i=input.read();
			
			while(i!=-1)
			{
				System.out.print((char) i);
				i=input.read();
			}
			input.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}

}

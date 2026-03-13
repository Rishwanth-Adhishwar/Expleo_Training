package fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] b= new byte[120];
		
		try
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\krish\\input.txt.txt");
			FileOutputStream fos=new FileOutputStream("C:\\Users\\krish\\output.txt.txt");
			System.out.println("Byte available: "+fis.available());
			int count=0,read=0;
			while((read=fis.read(b))!=-1)
			{
				fos.write(b);
				count+=read;
			}
			System.out.println("Total Count: "+count);
		}
		catch(FileNotFoundException x)
		{
			System.out.println(x);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}

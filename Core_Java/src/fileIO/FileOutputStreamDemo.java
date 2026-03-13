package fileIO;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data ="Welcome to java Programming,Happy Learning!";
		
		try
		{
			FileOutputStream output=new FileOutputStream("C:\\Users\\krish\\output.txt.txt");
			byte[] array =data.getBytes();
			
			output.write(array);
			output.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}

}

package easy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\krish/demo.txt"));
		
		String line;
		
		while((line=bf.readLine())!=null)
		{
			String sentence = line;
			
			System.out.println(sentence);
		}

	}

}

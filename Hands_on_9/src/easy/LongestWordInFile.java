package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongestWordInFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\krish/demo.txt"));
		String line;
		String lw = "";

		while ((line = br.readLine()) != null) {

			String[] words = line.split(" ");

			for (String word : words) {
				if (word.length() > lw.length()) {
					lw = word;
				}
			}
		}

		System.out.print("longest Word: "+lw);

	}

}

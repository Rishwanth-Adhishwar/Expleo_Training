package easy;

import java.io.File;

public class FileListByExtensions {
	
	public static void main(String[] args) {

        File folder = new File("C:\\Users\\krish");

        File[] files = folder.listFiles();

        for (File f : files) {

            if (f.getName().endsWith(".txt")) {
                System.out.println(f.getName());
            }
        }
    }

}

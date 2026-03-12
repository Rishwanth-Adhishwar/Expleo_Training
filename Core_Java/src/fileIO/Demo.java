package fileIO;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileSystem fs =  FileSystems.getDefault();
		Path p1=fs.getPath("C:\\ProgramData\\MySQL\\MySQL Installer for Windows");
		System.out.println(p1);

	}

}

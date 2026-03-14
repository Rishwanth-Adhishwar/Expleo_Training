package easy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

public class LastModifiedTimeOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path p = Paths.get("C:\\ProgramData\\MySQL\\MySQL Installer for Windows\\Manifest");
		
		try
		{
			 FileTime lmd = Files.getLastModifiedTime(p);
	         System.out.println("Last Modified Time: " + lmd);
		}
		catch(IOException x)
		{
			System.out.println(x);
		}

	}

}

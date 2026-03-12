package fileIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	
	public static void main(String args[])
	{
		Path p1=Paths.get("C:\\ProgramData\\MySQL\\MySQL Installer for Windows\\Manifest");
		Path p2=p1.subpath(0, 3);//if 0,4 Upto manifest
		
		System.out.println(p2);
		
	}

}

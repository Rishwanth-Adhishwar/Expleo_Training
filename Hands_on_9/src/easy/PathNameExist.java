package easy;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathNameExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path p = Paths.get("C:\\ProgramData\\MySQL\\MySQL Installer for Windows\\Manifest");
		
		boolean res=Files.exists(p);
		
		System.out.print("Path Exists: "+res);

	}

}

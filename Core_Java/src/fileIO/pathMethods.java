package fileIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class pathMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p1 = Paths.get("C:\\ProgramData\\MySQL\\MySQL Installer for Windows\\Manifest");
		Path normalizedPath=p1.normalize();
		
		Path p2 = Paths.get("C:\\ProgramData\\MySQL\\MySQL Installer for Windows\\Manifest");
		System.out.println("Normalized Path: "+normalizedPath);
		
		Path subPath=p1.subpath(1, 3);
		System.out.println("SubPath: "+subPath);
		
		System.out.println("Get File name: "+p1.getFileName());
		System.out.println("Get Parent: "+p1.getParent());
		System.out.println("Get NameCount: "+p1.getNameCount());
		System.out.println("Get Root: "+p1.getRoot());
		System.out.println("isAbsolute: "+p1.isAbsolute());
		System.out.println("toAbsolute: "+p1.toAbsolutePath());
		System.out.println("toUri: "+p1.toUri());
		
		if(p1.equals(p2))
		{
			System.out.println("Both are Equal");
		}
		else
		{
			System.out.println("Both are Not equal");
		}




	}

}

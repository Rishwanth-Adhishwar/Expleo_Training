package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SoftLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path existingFilePath = Paths.get("C:\\ProgramData\\MySQL\\MySQL Installer for Windows\\Manifest");
		Path symLinkPath=Paths.get("C:\\Manifest");
		
		
		
		try
		{
			Files.createSymbolicLink(symLinkPath, existingFilePath);
		}
		catch(IOException x)
		{
			System.err.println(x);
		}
		catch(UnsupportedOperationException x)
		{
			System.err.println(x);
		}

		//checking a file or Directory
		boolean result=Files.exists(existingFilePath);
		System.out.println("Path: "+existingFilePath+" Exists: "+result);//exist or not exists
		
		boolean result1=Files.isReadable(existingFilePath);
		System.out.println("File: "+existingFilePath+" isReadable: "+result1);//isReadable
		
		
		
	}

}

package Hard;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIOActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p = Paths.get("C:\\ProgramData\\MySQL\\MySQL Installer for Windows\\Manifest");
		Path slp=Paths.get("C:\\Manifest");
		boolean res=Files.exists(p);
		
		System.out.print("Path: "+p+" File Exists: "+res);
		
		if(res)
		{
			try
			{
				Files.createSymbolicLink(slp,p);
				
			}
			catch(IOException x)
			{
				System.out.println(x);
			}
			System.out.println();
			boolean readable=Files.isReadable(p);
			System.out.println("Readable: "+readable);
			
			boolean writable=Files.isWritable(p);
			System.out.println("Writable: "+writable);
			
		}

	}

}

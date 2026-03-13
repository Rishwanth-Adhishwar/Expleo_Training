package serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Employee object = new Employee(1,"Ram");
		String fileName="file.ser";
		
		try
		{
			FileOutputStream file=new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		}
		catch(IOException e)
		{
			System.out.println("IOException: "+e);
		}
		
		Employee object1=null;
		
		try
		{
			FileInputStream file=new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			object1=(Employee)in.readObject();
			in.close();file.close();
			System.out.println("Object has been deserialized");
			System.out.println("Employee Id: "+object1.empId+"\nEmployee name: "+object1.empName);
		}
		catch(IOException ex)
		{
			System.out.println("IOException: "+ex);
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is Caught");
		}

	}

}

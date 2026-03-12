package keywordSuper;

public class Programmer extends ProjectLeader{
	String ProgrammerName;
	int empId;
	
	
	
	void setData(String name,int id) //derived class method
	{
		ProgrammerName=name;
		empId=id;
	}
	
	void display()
	{
		System.out.println("Project Lead Name : "+ProjectLeadName);
		System.out.println("Project lead  Id: "+super.empId);
		System.out.println("Programmer Name: "+ProgrammerName);
		System.out.println("Programmer Id: "+empId);
		super.print();
	}
	
}

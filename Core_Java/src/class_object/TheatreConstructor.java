package class_object;

public class TheatreConstructor {
	
	int theatreId;
	String theatreName;
	int totalTheatreScreens;
	String theatrelocation;
	
	TheatreConstructor()//default  Constructor
	{
		
	}
	
	TheatreConstructor(int tid,String tname,int tts,String loc)//parameterized constructor
	{
		theatreId=tid;
		theatreName=tname;
		totalTheatreScreens=tts;
		theatrelocation=loc;
	}
	
	public void getTheatreDetails()
	{
		System.out.println("Theatre ID: "+theatreId);
		System.out.println("Theatre Name: "+theatreName);
		System.out.println("Theatre Total Screens: "+totalTheatreScreens);
		System.out.println("Theatre Location: "+theatrelocation);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheatreConstructor T = new TheatreConstructor();
		T.getTheatreDetails();
		

	}

}

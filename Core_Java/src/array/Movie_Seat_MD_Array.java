package array;

public class Movie_Seat_MD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] seatType= new String[][]{{"B","B","A","A","A"},{"A","A","A","B","B"},
			{"A","B","B","B","B"},{"B","A","A","B","A"}};
			
		int vipCount=0,premiumCount=0,regularCount=0,vipTotal=5,PremiumTotal=10,regularTotal=5;
		System.out.println("*****MOVIE SEAT ARRANGEMENT*****");
		for(int i=0;i<seatType.length;i++)
		{
			if(i==0)
			{
				System.out.println("*****VIP SEATS*****");
			}
			else if(i==1)
			{
				System.out.println("*****PREMIUM SEATS*****");
			}
			else if(i==3)
			{
				System.out.println("*****REGULAR SEATS*****");
			}
			for(int j=0;j<seatType[i].length;j++)
			{
				System.out.print(" "+seatType[i][j]+" ");
				if(i==0 && seatType[i][j].equalsIgnoreCase("B"))
				{
					vipCount++;
				}
				else if(i>0 &&i<3 && seatType[i][j].equalsIgnoreCase("B"))
				{
					premiumCount++;
				}
				else if(i==3 && seatType[i][j].equalsIgnoreCase("B"))
				{
					regularCount++;
				}
			}
			System.out.println();
		}
		
		System.out.println("*****SEAT BOOKED DETAIL*****");
		
		System.out.println("*****VIP SEATS*****");
		System.out.println("BOOKED: "+vipCount+" AVAILABLE: "+(vipTotal-vipCount+" TOTAL : "+vipTotal));
		
		System.out.println("*****PREMIUM SEATS*****");
		System.out.println("BOOKED: "+premiumCount+" AVAILABLE: "+(PremiumTotal-premiumCount+" TOTAL : "+PremiumTotal));
		
		System.out.println("*****REGULAR SEATS*****");
		System.out.println("BOOKED: "+regularCount+" AVAILABLE: "+(regularTotal-regularCount+" TOTAL : "+regularTotal));
		
		
		
			

	}

}

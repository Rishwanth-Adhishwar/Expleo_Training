package Control_Flow_Statements;

public class Nested_If_Condition_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age =15;
		int weight =50;
		
		if(age>18)
		{
			if(weight>50)
			{
				System.out.println("You are eligible to Donate Blood");
			}
			else
			{
				System.out.println("not Eligible to Donate Blood");
			}
		}
		else
		{
			System.out.println("Not Eligible because, you are under age");
		}

	}

}

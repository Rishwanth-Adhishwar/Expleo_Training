package Control_Flow_Statements;

public class If_Else_Condition_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isMoving = true; 
		int currentSpeed = 10;
		if (isMoving) //if Condition is true the if block will executed
		{
			currentSpeed--;
			System.out.println("The bicycle speed got reduced");
		}
		else //The else block executes,when if block is false
		{
			System.out.println("The bicycle has already stopped");
		}


	}

}

package problems;


public class Forward_Backward_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char start='a';
		char end='z';
		
		for(int i=0;i<26;i++)
		{
			System.out.print(start+""+end+" ");
			start++;
			end--;
		}
	}

}

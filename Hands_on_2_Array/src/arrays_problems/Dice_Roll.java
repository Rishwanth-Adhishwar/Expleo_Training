package arrays_problems;

import java.util.Random;

public class Dice_Roll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();

        int[] frequency = new int[6];  

        for (int i=0; i<100;i++) {
            int roll = random.nextInt(6);  
            frequency[roll]++;             
        }

        System.out.println("Dice Roll Frequency (100 times):");
        for (int i = 0; i < 6; i++) {
            System.out.println("Number "+(i + 1)+" appeared: "+frequency[i]+" times");
        }

	}

}

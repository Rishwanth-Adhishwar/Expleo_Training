package arrays_problems;

import java.util.Scanner;

public class Black_White_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean isStart = true;
		int a[] = new int[100], i = 0;

		System.out.println("Enter the Numbers: ");
		while (isStart) {
			int number = sc.nextInt();
			if (number==-1) {
				break;
			}
			a[i]=number;
			i++;
		}
		for (int j=0;j<i;j++) {
			if (a[j]%7==0 && a[j]%8==0) 
			{
				a[j]=-6;
			} 
			else if(a[j]%7==0) 
			{
				a[j]=-2;
			} 
			else if(a[j]%8==0) 
			{
				a[j] = -9;
			}
		}
		for (int k = 0; k < i; k++) {
			System.out.println(a[k]);
		}
	}
}

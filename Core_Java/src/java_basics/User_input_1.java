package java_basics;

import java.util.Scanner;

public class User_input_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//object created for Scanner class
		String name=sc.next();//Get user input
		System.out.println("Hi "+name+" nice to meet You!");
		

	}

}

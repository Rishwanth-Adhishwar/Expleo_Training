package javaHandson_7_Strings;

import java.util.*;
public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("User: ");
		String user=sc.nextLine();
		
		System.out.print("Password: ");
		String password=sc.nextLine();
		
		
		
		System.out.print("IP: ");
		String ip=sc.nextLine();
		
		String sp[]=ip.split("\\.");
		int a;
		
		for(int i=0;i<sp.length;i++)
		{
			a=Integer.parseInt(sp[i]);
			if(a<0 || a>255)
			{
				System.out.println("Invalid IP");
				return;
			}
		}
		
		System.out.print("Status: ");
		String status=sc.nextLine();
		
		password=password.replaceAll(password, "********");
		ip=ip.replaceAll(ip, "XXX.XXX.XXX.XXX");
		
		System.out.println("User: "+user+"\nPassword: "+password+"\nIP: "+ip+"\nStatus: "+status);
		
		

	}

}

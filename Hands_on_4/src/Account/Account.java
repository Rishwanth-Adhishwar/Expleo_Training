package Account;

import java.util.Scanner;

public class Account { //class Account
	
	//instance variables
	private String id;
	private String name;
	private int balance=0;
	
	//parameterized constructor
	Account(String id,String name)
	{
		this.id=id;
		this.name=name;
	}
	Account(String id,String name,int balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	//getters Method
	public String getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public int getBalance()
	{
		return balance;
	}
	
	public int credit(int amount)
	{
		
		return balance+=amount;
	}
	public int debit(int amount)
	{
		if(balance>=amount)
		{
			return balance-=amount;
		}
		else
		{
			System.out.println("Amount Exceeded Balance");
			return balance;
		}
	}
	public int transfer(Account u2,int amount)
	{
		if(balance>=amount)
		{
			balance-=amount;
			u2.balance+=amount;
		}
		else
		{
			System.out.println("Amount Exceeded Balance");
		}
		return balance;
	}
	
	public String toString()
	{
		return "Account Id: "+id+"\nAccount Holder Name: "+name+"\nBalance: "+balance;
	}
	
}

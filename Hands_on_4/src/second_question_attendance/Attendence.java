package second_question_attendance;

import java.time.LocalTime;
import java.util.Scanner;

public class Attendence {
	
	private LocalTime checkInTime;
	private LocalTime checkOutTime;
	private int empId;
	private boolean isCheckIn ;
	private boolean isCheckOut  ;

	Scanner sc = new Scanner(System.in);
	public boolean markCheckIn()
	{
		this.checkInTime = LocalTime.now();;
		
		if (!isCheckIn)
		{
			isCheckIn = true ;
			isCheckOut = false ;
			return true ;
		}
		
		return false ;	
	}
	
	public boolean markCheckOut()
	{
		this.checkOutTime = LocalTime.now(); ;
		
		if (isCheckIn)
		{
			isCheckOut = true ;
			
			return true ;
		}
		return false;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public boolean isCheckIn() {
		return isCheckIn;
	}

	public void setCheckIn(boolean isCheckIn) {
		this.isCheckIn = isCheckIn;
	}

	public boolean isCheckOut() {
		return isCheckOut;
	}

	public void setCheckOut(boolean isCheckOut) {
		this.isCheckOut = isCheckOut;
	}

	@Override
	public String toString() {
		
		return "Employee ID : "+ empId + "\nCheckIn Time : " + checkInTime + "\nCheckOut Time : "+ checkOutTime+"\n"; 
	}
}

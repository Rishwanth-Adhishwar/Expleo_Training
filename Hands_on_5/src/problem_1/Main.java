package problem_1;

class Employee {

	protected String empId;
	protected String empName;
	protected double baseSalary;

	Employee(String empId, String empName, double baseSalary) {
		this.empId = empId;
		this.empName = empName;
		this.baseSalary = baseSalary;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public double calculateSalary() {
		return baseSalary;
	}

	@Override
	public String toString() {
		return "Employee ID: " + empId + ", Name: " + empName + ", Final Salary: " + calculateSalary();
	}
}

class PermanentEmployee extends Employee {

	double bonus;

	PermanentEmployee(String empId, String empName, double baseSalary, double bonus) {
		super(empId, empName, baseSalary);
		this.bonus = bonus;
	}

	@Override
	public double calculateSalary() {
		return baseSalary + bonus;
	}
}

class ContractEmployee extends Employee {

	double taxRate;
	double serviceCharge;

	ContractEmployee(String empId, String empName, double baseSalary, double taxRate, double serviceCharge) {
		super(empId, empName, baseSalary);
		this.taxRate = taxRate;
		this.serviceCharge = serviceCharge;
	}

	@Override
	public double calculateSalary() {
		return baseSalary-(baseSalary*taxRate)-serviceCharge;
	}
}

class Intern extends Employee {

	double stipend;

	Intern(String empId, String empName, double stipend) {
		super(empId, empName, 0);
		this.stipend = stipend;
	}

	@Override
	public double calculateSalary() {
		return stipend;
	}
}

public class Main {

	public static void main(String[] args) {
		Employee e1 = new PermanentEmployee("E101", "Ravi", 50000, 10000);
		Employee e2 = new ContractEmployee("E102", "Priya", 40000, 0.1, 2000);
		Employee e3 = new Intern("E103", "Arun", 15000);

		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());

	}

}

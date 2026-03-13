package serialization_deserialization;

 class Employee implements java.io.Serializable {
	 
	 public transient int empId;
	 public String empName;
	 
	 public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	 }
}

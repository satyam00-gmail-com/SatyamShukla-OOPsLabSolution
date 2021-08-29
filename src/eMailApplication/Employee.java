package eMailApplication;


public class Employee {
	
	private  String FirstName;
	private String LastName;
	private String DepartmentName;
	
	public Employee(String fName,String lNAme,String deptNAme) 	
	{
		this.FirstName=fName;
		this.LastName=lNAme;
		this.DepartmentName=deptNAme;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
}

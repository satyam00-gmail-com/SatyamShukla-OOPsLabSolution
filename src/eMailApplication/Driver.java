package eMailApplication;


import Service.CredentialService.CredentialService;

import java.util.Scanner;

public class Driver {
	
	public static void main(String args [])
	
	{		
		Scanner sc =new Scanner (System.in);
		System.out.println("First Name: ");
		String empFirstName= sc.next();
		System.out.println("Last Name: ");
		String empLastName= sc.next();
		System.out.println("Choose your department 1-4");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");		
		Integer empDeptInt= sc.nextInt();
		//System.out.println("You have provided input as "+empDeptInt );	
		String empDeptName="";
		switch(empDeptInt)
		{
		case 1 : 
			empDeptName = "Technical"; 
			break;
		case 2 : 
			empDeptName = "Admin" ; 
			break;
		case 3 : 
			empDeptName = "Human Resources"; 
			break;
		case 4 : 
			empDeptName = "Legal"; 
			break;
		default: {
			System.out.println("Invalid input. Exiting the program"); 
			sc.close(); 
			System.exit(1);}
		}
		Employee emp1 = new Employee (empFirstName, empLastName, empDeptName);	
		CredentialService cred1 = new CredentialService();
		String eMail= cred1.generateEmail(emp1);
		String password=cred1.generatePwd(emp1);
		System.out.println(cred1.showCredentials (eMail, password));
		sc.close();				
	}

}

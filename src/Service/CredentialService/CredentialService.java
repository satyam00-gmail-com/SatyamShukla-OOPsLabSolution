package Service.CredentialService;


import eMailApplication.Employee;
import java.util.Random;

public class CredentialService {
	
	
	public String generateEmail(Employee emp1) 
	
	{
		StringBuilder builder= new StringBuilder();
		builder.append(emp1.getFirstName())
				.append(emp1.getLastName())
				.append("@")
				.append(emp1.getDepartmentName()).append(".abc.com");
		return builder.toString();
						
	}	
	public String generatePwd(Employee emp1) 	
	{
		String possibleChars= " !\"#$%&\\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
		
		Random random= new Random();
		String password ="";
		for (int i=0; i<8;i++) {
			int idx= random.nextInt(possibleChars.length());
					 password=password+possibleChars.charAt(idx);
			}
		return password;
			
	}
	
	public  String showCredentials(String email,String password) 
	
	{
		return "Email --> "+ email +"\n"+ "Password --> "+ password;
	}
}

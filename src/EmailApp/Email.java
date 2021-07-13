package EmailApp;

import java.util.Scanner;

public class Email
{

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	public String email;
	
	public String companytSuffix="aeycompany.com";
	
 
	public Email(String firstName,String LastName)
	{
		this.firstName=firstName;
		this.lastName=LastName;
		System.out.println("EMAIL CREATED :"+firstName+" "+lastName);
		this.department=SetDepartment();
		System.out.println("Department :"+this.department);
		this.password=randomPassword(8);
		System.out.println("Password :"+this.password);
		this.email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+this.department+companytSuffix;
		System.out.println("Email :"+this.email);
		
	
	}
	
	private String SetDepartment()
	{
		System.out.println("Enter the department\n1 for Sales\n2 for Development for Accounting\n0 for none");
		Scanner in=new Scanner(System.in);
		int depChoice=in.nextInt();
		if(depChoice==1) {return "sales";}
		else if(depChoice==2) {return "dev";}
		else if(depChoice==2) {return "acct";}
		else {return "";}
	}
	public String randomPassword(int length)
	{
		String passwordSet="ABCDEFGHIJKLMNOPRSTUVYZ0123456789!@#$%";
		char[] password=new char[length];
		for (int i = 0; i <length; i++) 
		{
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
			
		}
		return new String(password);
	}
	public void setAlternateEmail(String altmail)
	{
		this.alternateEmail=altmail;
	}
	public String GetAlternateEmail() {	return alternateEmail;}
	
     public String GetPassword() {return password;}
	public void ChangePassword(String password) {this.password=password;}
	
}

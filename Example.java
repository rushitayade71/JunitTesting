package JunitTesting;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
	static String firstName;
	String lastName;
	String password;
	String mailId;
	String mobilenum;
	public static boolean validatefirstname(String first_name)
	{
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher matcher = pattern.matcher(first_name);
		return matcher.find();
	}
		public static boolean validatelastname(String last_name)
		{
			Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
			Matcher matcher = pattern.matcher(last_name);
			return matcher.find();
			
	}
	public static boolean validatemailId(String mail_Id)
	{
		Pattern pattern = Pattern.compile("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$");
		Matcher matcher = pattern.matcher(mail_Id);
		return matcher.find();
		
	}
	public static boolean validatepassword(String Password)
	{
		Pattern pattern = Pattern.compile("^(?=.*[@#$%^&-+=()])(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}");
		Matcher matcher = pattern.matcher(Password);
		return matcher.find();
		
	}
	public static boolean validatemobilenum(String Mobilenum)
	{
		Pattern pattern = Pattern.compile("^\\d{10}$");
		Matcher matcher = pattern.matcher(Mobilenum);
		return matcher.find();
		
	}

	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = scanner.next();
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter last name");
		String lastName = scanner1.next();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter password");
		String password = scanner2.next();
		
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("Enter mailId");
		String mailId = scanner3.next();
		
		Scanner scanner4 = new Scanner(System.in);
		System.out.println("Enter mobile number");
		String mobilenum = scanner4.next();
	
	    
	      if (validatefirstname(firstName) == true) {
	          System.out.println("First Name: "+ firstName);

	      }
	        else {
	                System.out.println("Invalid");}
	      
	      if (validatelastname(lastName) == true) {
	          System.out.println("last Name: "+ lastName);

	      }
	        else {
	                System.out.println("Invalid");}
	     
	      
	      if (validatepassword(password) == true) {
	          System.out.println("Security code: "+ password);

	      }
	        else {
	                System.out.println("Invalid");}

	      if (validatemobilenum(mobilenum) == true) {
	          System.out.println("Contact no: "+ mobilenum);

	      }
	        else {
	                System.out.println("Invalid");}

	}


}
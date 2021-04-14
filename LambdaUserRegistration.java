package JunitTesting;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface UsersInputs{
    Boolean check(String regexPattern, String userInput);
}


public class LambdaUserRegistration {

    static String getInputs(String input) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your " + input);
        String getInput = inp.nextLine();
        return getInput;
    }


    public static void main(String[] args) {

        String first_name = LambdaUserRegistration.getInputs("First Name");
        String last_name = LambdaUserRegistration.getInputs("Last Name");
        String email1 = LambdaUserRegistration.getInputs("Email");
        String mobileNum = LambdaUserRegistration.getInputs("Mobile Number");
        String pWord = LambdaUserRegistration.getInputs("Password");

        UsersInputs firstName = (regexPattern, userInput) -> Pattern.matches(regexPattern, userInput);
        UsersInputs lastName = (regexPattern, userInput) -> Pattern.matches(regexPattern, userInput);
        UsersInputs email = (regexPattern, userInput) -> Pattern.matches(regexPattern, userInput);
        UsersInputs phoneNumber = (regexPattern, userInput) -> Pattern.matches(regexPattern, userInput);
        UsersInputs password = (regexPattern, userInput) -> Pattern.matches(regexPattern, userInput);

        Boolean fName = firstName.check("^[A-Z]{1}[a-z]{2,}", first_name);
        Boolean lName = lastName.check("^[A-Z]{1}[a-z]{2,}", last_name);
        Boolean eMail = email.check("^[\\w-\\+]+(\\.[\\w]+)@[\\w-]+(\\.[\\w]+)(\\.[a-z]{2,})$", email1);
        Boolean pNum = phoneNumber.check("^\\d{10}$", mobileNum);
        Boolean passWord = password.check("^(?=.[@#$%^&-+=()])(?=.[0-9])(?=.[a-z])(?=.[A-Z]).{8,}", pWord);

        System.out.println("Validation for user input firstName is " + fName);
        System.out.println("Validation for user input lastName is " + lName);
        System.out.println("Validation for user input email is " + eMail);
        System.out.println("Validation for user input phoneNumber is " + pNum);
        System.out.println("Validation for user input password is " + passWord);
    }
}
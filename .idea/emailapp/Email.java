package emailapp;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix;
private String company;
    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;




        // Call a method asking for the department - return the department
        this.department = setDepartment();



        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + company;

    }

    // Ask for the department
    private String setDepartment() {
        System.out.print(" New worker:" + " " + firstName + ". Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) { return "sales";}
        else if (depChoice == 2) {return "dev";}
        else if (depChoice == 3) { return "acct";}
        else { return ""; }

        }

    // Generate a random password
    private String randomPassword(int lenght) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@£$€!%&";
        char [] password = new char[lenght];
        for (int i=0; i<lenght; i++) {
           int rand = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail (String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }
    public int getMailboxCapacity() { return mailboxCapacity; }
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword() { return password; }
    public String showInfo() {
        return "DISPLAY NAME:" + " " + this.firstName + " " + this.lastName +
                "\nCOMPANY EMAIL:" + " " + this.email +
                "\nMAILBOX CAPACITY:" + " " +mailboxCapacity + "mb";
    }


    public void setCompanySuffix(String companySuffix) {
        this.companySuffix = companySuffix;
    }
}






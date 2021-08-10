package ifStatement;

public class Main {
    public static void main(String[] args) {

        // if statement = performs a block of code if it's condition evaluates to be true

        int age = 1;

        if(age>=75) {
            System.out.println("ok Boomer!");

        }

       else if(age>=18) {
            System.out.println("you are an adult!");

        }
       else if(age>=13) {
            System.out.println("You are a teenager!");
        }
        else {
            System.out.println("you are not an adult!");
        }
    }
}

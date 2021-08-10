package Methods;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the iser to enter two integers
        System.out.println("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int n2 = input.nextInt();
        System.out.println("The greatest common divisor for " + n1 + " And " + n2 + " is " + gcd(n1,n2));
    }

    // Return the gcd of two integers

    public static int gcd(int n1, int n2) {
        int gcd = 1;
        int k = 2;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
                k++;


        }
        return gcd;
    }
}

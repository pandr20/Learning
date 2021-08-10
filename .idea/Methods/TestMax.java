package Methods;

public class TestMax {

    public static void main(String[] args) {

        int j = 5;
        int k = 7;
        int x = max(j,k);
        System.out.println("The maximum of " + j + " And " + k + "is " + x);
    }

    // Return the max of 2 number
    public static int max(int num1, int num2) {
        int result;
        if (num1 < num2) {
            result = num2;
        } else {
            result = num1;
        }
    return result;
    }
}

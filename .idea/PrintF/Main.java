package PrintF;

public class Main {
    public static void main(String[] args) {
        //printf() = an optional method to control, format, and display text to the console window
        //           two arguments = format string + (object/variable)
        //           % [flags] [precision] [width] [conversion-character]

       // System.out.printf("%d This is a format string ", 123); // 123 will be at the beginning

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character]
        //System.out.println("%b", myBoolean);
        //System.out.println("%c", myChar);
        //System.out.println("%s", myString);
        //System.out.println("%d", myInt);
        //System.out.println("%f", myDouble);

        // [width]
        // minimum number of characters to be written as output
        //System.out.printf("Hello %10s", myString);

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        //System.out.printf("You have this much money %.2f ", myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        //System.out.printf("You have this much money %,f ", myDouble);


    }
}

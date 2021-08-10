package Methods;

public class Main {

    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon
        String name = "bro";
        int age = 21;
        hello(name,age);

    }

    static void hello(String name, int age) { // name in static void hello(String "anything") doesn't have to match the data type String name
        System.out.println("hello "+ name);
        System.out.println("You are "+ age);
    }
}

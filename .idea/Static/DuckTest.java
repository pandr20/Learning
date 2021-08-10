package Static;

public class DuckTest {


    public static void main(String[] args) {
        
        Duck d = new Duck();
        Duck s = new Duck();
        s.getSize();
        d.quack();
        d.setSize(42);
        //d.getSize();


        System.out.println(d.getSize());
    }
}

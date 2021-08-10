package Methods;

public class mainReturn {

    public static void main(String[] args) {
        // Return types

        int x = 3;
        int y = 4;

        int z = add(x,y);

        System.out.println(z);
        System.out.println(add(x,y));
    }
// You use void if you don't return anything, and the data type if you return data.
    static int add(int x, int y) {

       // int z = x + y;
        //return z; // you could also write it shorter like this

        return x + y;

    }
}

package DuckConstructor;

public class Duck {
    int size;
    String name;

    public Duck () { // Makes a default size if the other programmer does not know what size he want
        size = 27;
    }

    public Duck (int size) {
        System.out.println("Quark");

        int DuckSize = size;

        System.out.println("Size is " + size );
    }

    public Duck (int size, String name) {
        System.out.println("Quark");

        int DuckSize = size;
        String DuckName = name;

        System.out.println("Size is " + size + " Name is " + name );
    }
}

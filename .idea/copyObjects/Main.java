package copyObjects;

public class Main {

    public static void main(String[] args) {

        PC pc1 = new PC("Macbook", "air", 2019);
        //PC pc2 = new PC("Macbook", "pro", 2020);
        PC pc2 = new PC(pc1);

        //pc2.copy(pc1);

        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println();
        System.out.println(pc1.getMake());
        System.out.println(pc1.getModel());
        System.out.println(pc1.getYear());
        System.out.println();
        System.out.println(pc2.getMake());
        System.out.println(pc2.getModel());
        System.out.println(pc2.getYear());

    }
}

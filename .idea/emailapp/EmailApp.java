package emailapp;

public class EmailApp {

    public static void main(String[] args) {
        Email em1 = new Email("Laura", "Lykkegaard","IT");
        Email em2 = new Email("Brian", "Larsen","Sales");



        System.out.println(em1.showInfo());
        System.out.println(em2.showInfo());



    }
}

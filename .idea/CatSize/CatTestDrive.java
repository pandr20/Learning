package CatSize;

public class CatTestDrive  {

    public static void main(String[] args) {

        Cat one = new Cat();
        one.setSize(70);
        Cat two = new Cat();
        two.setSize(8);
        Cat three = new Cat();
        three.setSize(35);

        one.meow(7);
        two.meow(4);
        three.meow(3);
        one.beFriendly();
        one.Play();


    }



}

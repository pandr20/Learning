package CatSize;

public class Cat implements Pet{

     private int size;
     private String name;

     public int getSize() {
         return size;
     }
     public void setSize(int s){
         size = s;
     }

    void meow(int numOfMeows) {
        while(numOfMeows > 0) {
            if(size > 60) {
                System.out.println("roar");
            } else if (size > 14) {
                System.out.println("Meow");
            } else {
                System.out.println("miv");
            }
            numOfMeows = numOfMeows - 1;
        }

    }

    @Override
    public void beFriendly() {
        System.out.println("Make owner happy");
    }

    @Override
    public void Play() {
        System.out.println("Run after toy mouse");
    }
}

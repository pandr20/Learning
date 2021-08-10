package Static;

public class Duck {
    private int size;
    private static int duckCount = 0;

    public Duck () {
        duckCount++;
        System.out.println(duckCount);
    }

    public void setSize(int s) {
        this.size = s;


    }
    public int getSize() {
        return size;
    }

    void quack() {
        System.out.println("Quack Quack");
    }


}

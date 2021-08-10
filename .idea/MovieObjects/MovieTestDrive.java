package MovieObjects;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Die hard";
        one.genre = "Action";
        one.rating = 5;
        Movie two = new Movie();
        two.title = "Topgun";
        two.genre = "Action";
        two.rating = 4;
        two.play();
        Movie three = new Movie();
        three.title = "titanic";
        three.genre = "Romantic";
        three.rating = 3;
    }
}

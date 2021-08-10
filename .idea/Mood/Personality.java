package Mood;

public class Personality implements MoodLevels{

    String feelings;
    String name;
    int age;

    public Personality (String feelings, String name, int age) {
        //String myFeelings = this.feelings;
        //String myName = this.name;
        this.feelings = feelings;
        this.name = name;
        int myAge = this.age;

        System.out.println("Making a persons personality");
    }


    @Override
    public void happy() {
        System.out.println(" person is smiling a lot, people like being around this person");
    }

    @Override
    public void sad() {
        System.out.println(" person can cry, people feel sorry for you sometimes");

    }

    @Override
    public void depressed() {
        System.out.println(" person isolate themselves, cry's a lot, thinking life is hopeless ");

    }

    @Override
    public void positive() {
        System.out.println(" person looks at life as the world is full of opportunities, life is great ");

    }

    @Override
    public void negative() {
        System.out.println(" person looks at life as the world is cruel and harsh, life is unfair and hard");

    }
}

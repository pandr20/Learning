package DynamicPolymorphism;

public class Dog extends Animal{

    @Override
    public void speak() {
        System.out.println("dog goes *woof*");
    }
}

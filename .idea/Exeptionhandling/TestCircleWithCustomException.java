package Exeptionhandling;

public class TestCircleWithCustomException extends Exception {

    public static void main(String[] args) {

     /*


        try {


            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);
        }
        catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }

        System.out.println("Number of objects created: " + CircleWithCustomException.getNumberOfObjects());

    }

    public InvalidRadiusException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }
class CicleWithCustomException {
    private double radius;

    private static int numberOfObjects = 0;

    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);
    }

    public CircleWithCustomException(double newRadius)
        throws InvalidRadiusException {
        setRadius(newRadius);
        numberOfObjects++;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius)
        throws InvalidRadiusException {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new InvalidRadiusException(newRadius);
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    public double findArea() {
        return radius * radius * 3.14159;
    }
}
*/
    }
}
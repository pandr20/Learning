package encapsulation;

public class Bike {

    private String make;
    private String model;
    private int year;

    Bike(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        // you could use set here this.setMake(make)


    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

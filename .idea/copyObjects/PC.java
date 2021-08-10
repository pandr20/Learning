package copyObjects;

public class PC {

    private String make;
    private String model;
    private int year;

    PC(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);

    }
    PC(PC x) {
        this.copy(x);

    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setModel(String model) {
        this.model = model;
    }

    private void setMake(String make) {
        this.make = make;
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

    public void copy(PC pc1) {
        this.setMake(pc1.getMake());
        this.setModel(pc1.getModel());
        this.setYear(pc1.getYear());
    }
}

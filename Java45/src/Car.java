public class Car extends Vehicle{
    private String fuel;

    public Car(Producer45 producer45, String fuel) {
        super(producer45);
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public double Speed() {
        return 60;
    }
}

public class Plane extends Vehicle{
    private String fuel;

    public Plane(Producer45 producer45, String fuel) {
        super(producer45);
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void Lift()
    {
        System.out.println("Lift");
    }
    public void Landing()
    {
        System.out.println("Landing");
    }



    @Override
    public double Speed() {
        return 500;
    }
}

public abstract class Vehicle {
    protected Producer45 producer45;

    public Vehicle(Producer45 producer45) {
        this.producer45 = producer45;
    }

    public Producer45 getProducer45() {
        return producer45;
    }

    public void setProducer45(Producer45 producer45) {
        this.producer45 = producer45;
    }

    public String printProducer()
    {
        return producer45.getName();
    }

    public void Start()
    {
        System.out.println("Start");
    }
    public void Boots()
    {
        System.out.println("Boots");
    }
    public void Stop()
    {
        System.out.println("Stop");
    }

    public abstract double Speed();
}

public class Computer {
    private Producer38 nameProducer;
    private Date38 date;
    private double price;
    private int warraly;

    public Computer(Producer38 nameProducer, Date38 date, double price, int warraly) {
        this.nameProducer = nameProducer;
        this.date = date;
        this.price = price;
        this.warraly = warraly;
    }

    public Producer38 getNameProducer() {
        return nameProducer;
    }

    public void setNameProducer(Producer38 nameProducer) {
        this.nameProducer = nameProducer;
    }

    public Date38 getDate() {
        return date;
    }

    public void setDate(Date38 date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWarraly() {
        return warraly;
    }

    public void setWarraly(int warraly) {
        this.warraly = warraly;
    }

    public boolean checkPrice(Computer x)
    {
        return this.price<x.price;
    }

    public String printNation()
    {
        return this.nameProducer.getNaton().getName();
    }
}

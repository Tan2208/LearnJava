public class Movie {
    private String nameMovie;
    private double price;
    private int year;
    private Producer producer;
    private Date36 date;

    public Movie(String nameMovie, double price, int year, Producer producer, Date36 date) {
        this.nameMovie = nameMovie;
        this.price = price;
        this.year = year;
        this.producer = producer;
        this.date = date;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Date36 getDate() {
        return date;
    }

    public void setDate(Date36 date) {
        this.date = date;
    }

    public boolean checkPriceMovie(Movie m)
    {
        return this.price<m.price;
    }

    public String printNameProducer()
    {
        return this.producer.getNameProducer();
    }

    public double priceFinal(double x)
    {
        return this.price*(1-x/100);
    }
}

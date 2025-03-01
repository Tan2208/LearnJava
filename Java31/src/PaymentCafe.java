public class PaymentCafe {
    private  String nameCafe;
    private  double price1kg;
    private double weight;

    public PaymentCafe(String nameCafe,double price1kg,double weight)
    {
        this.nameCafe = nameCafe;
        this.price1kg = price1kg;
        this.weight = weight;
    }

    public double totalPrice()
    {
        return this.weight *this.price1kg;
    }

    public boolean checkWeight(double w1)
    {
       return this.weight > w1;
    }
    public boolean checkTotalPrice()
    {
        return this.totalPrice() > 500000;
    }

    public  double discount(double x)
    {
        if(checkTotalPrice())
            return (x/100)*this.totalPrice();
        else
            return 0;
    }

    public  double priceFinal(double x)
    {
        return this.totalPrice()-this.discount(x);
    }

}

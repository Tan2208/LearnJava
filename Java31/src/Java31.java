public class Java31 {
    public static void main(String[] args)
    {
        PaymentCafe payC = new PaymentCafe("Trung Nguyen",150000,1.5);
        PaymentCafe payC2 = new PaymentCafe("Trung Nguyen",200000,4.5);
        System.out.println("Total:"+payC.totalPrice());
        System.out.println("Total:"+payC2.totalPrice());
        System.out.println("Check weight > 2kg:"+payC.checkWeight(2));
        System.out.println("Check weight > 1kg:"+payC.checkWeight(1));
        System.out.println("Check total price > 500000:"+payC.checkTotalPrice());
        System.out.println("Check total price > 500000:"+payC2.checkTotalPrice());
        System.out.println("Discount:"+payC.discount(10));
        System.out.println("Discount:"+payC2.discount(10));
        System.out.println("Price final:"+payC.priceFinal(10));
        System.out.println("Price final:"+payC2.priceFinal(10));
    }
}

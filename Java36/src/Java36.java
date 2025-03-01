public class Java36 {
    public static void main(String[] args){
        Date36 date1 =new Date36(10,5,2024);
        Date36 date2 =new Date36(15,12,2024);

        Producer prd1 = new Producer("Disney","USA");
        Producer prd2 = new Producer("Pixal","England");

        Movie mv1= new Movie("Lion King",15000,2024,prd1,date1);
        Movie mv2= new Movie("Up",20000,2024,prd2,date2);

        System.out.println("Movie 1 cheaper Movie 2: "+ mv1.checkPriceMovie(mv2));

        System.out.println("Name producer movie 2: "+ mv2.printNameProducer());

        System.out.println("Price movie 1 when discount 10%: "+mv1.priceFinal(10));
        System.out.println("Price movie 2 when discount 20%: "+mv2.priceFinal(20));
    }
}

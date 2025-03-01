public class Java35 {
    public static void main(String[] args)
    {
        Date date1= new Date(11,3,1995);
        Date date2= new Date(23,8,1985);
        Date date3= new Date(1,1,2000);

        Author author1 = new Author("Peter",date1);
        Author author2 = new Author("Sam",date2);
        Author author3 = new Author("Tom",date3);

        Book book1 = new Book("Lập trình Java",2010,5000,author1);
        Book book2 = new Book("Lập trình C",2010,7000,author2);
        Book book3 = new Book("Lập trình Python",2024,10000,author3);

        book1.printBook();
        book2.printBook();
        book3.printBook();


        System.out.println("Check book year: "+book1.checkBookYear(book2));
        System.out.println("Check book year: "+book1.checkBookYear(book3));

        System.out.println("Book 1 discount 10%: "+book1.priceFinal(10));
        System.out.println("Book 2 discount 50%: "+book2.priceFinal(50));
        System.out.println("Book 3 discount 20%: "+book3.priceFinal(20));

    }
}

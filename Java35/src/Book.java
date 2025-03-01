public class Book {
    private String nameBook;
    private double price;
    private int year;
    private Author author;

    public Book(String nameBook, int year, double price, Author author) {
        this.nameBook = nameBook;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    public void printBook()
    {
        System.out.println(this.nameBook);
    }

    public  boolean checkBookYear(Book b)
    {
        return this.year==b.year;
    }

    public  double priceFinal(double x)
    {
        return this.price*(1-x/100);
    }
}

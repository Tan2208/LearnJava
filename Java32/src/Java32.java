public class Java32 {
    public static void main(String[] args)
    {
        MyDate32 md32=new MyDate32(27,2,2025);

        md32.printDate();
        md32.setDay(35);
        System.out.println("Day:"+md32.getDay());
        md32.setDay(15);
        System.out.println("Day:"+md32.getDay());

        md32.setMonth(13);
        System.out.println("Month:"+md32.getMonth());
        md32.setMonth(8);
        System.out.println("Month:"+md32.getMonth());

        md32.setYear(0);
        System.out.println("Year:"+md32.getYear());
        md32.setYear(2022);
        System.out.println("Year:"+md32.getYear());
    }
}

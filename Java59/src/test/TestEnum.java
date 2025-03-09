package test;

public class TestEnum {
    public static void main(String[] args)
    {
        TimeTable tb1 = new TimeTable(Day.Monday,"Math Physics Chemistry");
        TimeTable tb2 = new TimeTable(Day.Tuesday,"Math Math Math");
        System.out.println(tb2);

        int x= Month.MONTH_3.day();
        System.out.println("Day: "+x);
    }
}

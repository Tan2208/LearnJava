import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Java58 {
    public static void main(String[] args)
    {
        //CurrentTime
        long t1= System.currentTimeMillis();
        for (int i=0;i<10;i++)
        {
            System.out.println("TEST");
        }

        long t2 = System.currentTimeMillis();

        System.out.println("Time before run for: "+t1);
        System.out.println("Time after run for: "+t2);
        System.out.println("Time: "+(t2-t1)+ "mls");
        System.out.println("Time: "+(t2-t1)/1000+ "s");


        //TimeUnit
        System.out.println("10 year: "+ TimeUnit.DAYS.toSeconds(10*365)+"s");
        System.out.println("10 hour: "+ TimeUnit.HOURS.toSeconds(10)+"s");

        //Date
        Date d = new Date(System.currentTimeMillis());
        System.out.println("Day: "+d.getDate()+" Month: "+(d.getMonth()+1)+" Year: "+(d.getYear()+1900));

        //Calender
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));

        c.add(Calendar.DATE,10);
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));

        //DateFormat
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(d));

        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}

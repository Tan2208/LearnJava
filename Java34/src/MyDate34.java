import java.util.Objects;

public class MyDate34 {
    private int day;
    private int month;
    private int year;

    public MyDate34(int day, int month, int year) {
        if(day >=1 && day <=31)
            this.day = day;
        else
            this.day = 1;

        if(month>=1 && month<=12)
            this.month = month;
        else
            this.month = 1;

        if(year>=1)
            this.year = year;
        else
            this.year = 1;
    }


    public int getDay() {

        return day;
    }

    public void setDay(int day) {

        if(day >=1 && day<=31)
            this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month >=1 && month<=12)
            this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >=1)
            this.year = year;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (o == null)
//            return false;
//        if (this.getClass() != o.getClass())
//            return false;
//        MyDate34 other = (MyDate34) o;
//        if (this.day != other.day)
//            return false;
//        if (this.month != other.month)
//            return false;
//        if (this.year != other.year)
//            return false;
//        return true;
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MyDate34 myDate34 = (MyDate34) o;
        return getDay() == myDate34.getDay() && getMonth() == myDate34.getMonth() && getYear() == myDate34.getYear();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDay(), getMonth(), getYear());
    }

    @Override
    public String toString() {
        return
                "day=" + day +
                ", month=" + month +
                ", year=" + year;
    }
}

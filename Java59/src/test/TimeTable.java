package test;

public class TimeTable {
    private Day day;
    private String subject;

    public TimeTable(Day day, String subject) {
        this.day = day;
        this.subject = subject;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "TimeTable{" +
                "day=" + day +
                ", subject='" + subject + '\'' +
                '}';
    }
}

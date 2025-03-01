import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private DateBirth date;
    private double score;
    private Class cl;

    public Student(String id, String name, DateBirth date, double score, Class cl) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.score = score;
        this.cl = cl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateBirth getDate() {
        return date;
    }

    public void setDate(DateBirth date) {
        this.date = date;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Class getCl() {
        return cl;
    }

    public void setCl(Class cl) {
        this.cl = cl;
    }


    public  String printNameFaculty()
    {
        return this.cl.getNameFaculty();
    }

    public  boolean checkDateBrith(Student st)
    {
        return this.date.equals(st.date);
    }


    public  boolean checkPassCourse()
    {
        return this.score>=5;
    }




}

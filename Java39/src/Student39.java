public class Student39 extends Human{
    private String nameClass;
    private double score;

    public Student39(String name, int year, String nameClass, double score) {
        super(name, year);
        this.nameClass = nameClass;
        this.score = score;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void homework(){
        System.out.println("Homework");
    }
}

public class Student54 implements Comparable<Student54> {
    private String fullName,nameClass;
    private int id;
    private double averageScore;

    public Student54(String fullName, String nameClass, int id, double averageScore) {
        this.fullName = fullName;
        this.nameClass = nameClass;
        this.id = id;
        this.averageScore = averageScore;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getName(){
        String s = this.fullName.trim();
        if(s.indexOf(" ")>=0)
        {
            int vt = s.lastIndexOf(" ");
            return s.substring(vt+1);

        }else {
            return s;
        }
    }
    @Override
    public int compareTo(Student54 o) {

        String nameThis = this.getName();
        String nameO = o.getName();

        return nameThis.compareTo(nameO);
    }
}

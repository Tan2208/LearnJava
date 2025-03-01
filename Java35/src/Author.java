

public class Author {
    private String nameAuthor;
    private Date dayBirth;

    public Author(String nameAuthor, Date dayBirth) {
        this.nameAuthor = nameAuthor;
        this.dayBirth = dayBirth;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public Date getDayBirth() {
        return dayBirth;
    }

    public void setDayBirth(Date dayBirth) {
        this.dayBirth = dayBirth;
    }
}

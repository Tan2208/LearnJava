public class Animal42 {
    protected String name;

    public Animal42(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat()
    {
        System.out.println("Eat");
    }

    public  void makeSound()
    {
        System.out.println("..........");
    }
    public void sleep()
    {
        System.out.println("ZZZZZZZZZ");
    }
}

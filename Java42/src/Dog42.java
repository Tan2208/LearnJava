public class Dog42 extends Animal42{

    public Dog42() {
        super("Dog");
    }

    @Override
    public void eat() {
        System.out.println("Eat bone");
    }

    @Override
    public void makeSound() {
        System.out.println("Gau Gau");

    }
}

public class Bird42 extends Animal42{

    public Bird42() {
        super("Bird");
    }

    @Override
    public void eat() {
        System.out.println("Eat worm");
    }

    @Override
    public void makeSound() {
        System.out.println("Chit chit");
    }
}

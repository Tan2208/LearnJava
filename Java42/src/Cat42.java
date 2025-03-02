public class Cat42 extends Animal42{

    public Cat42() {
        super("Cat");
    }

    @Override
    public void eat() {
        System.out.println("Eat fish");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");

    }
}

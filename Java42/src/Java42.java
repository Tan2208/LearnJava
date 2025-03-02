public class Java42 {
    public static void main(String[] args)
    {
        Dog42 d =new Dog42();
        d.eat();
        d.makeSound();
        d.sleep();
        System.out.println("----------------");
        Cat42 c=new Cat42();
        c.eat();
        c.sleep();
        c.sleep();
        System.out.println("----------------");
        Bird42 b =new Bird42();
        b.eat();
        b.makeSound();
        b.sleep();
    }
}

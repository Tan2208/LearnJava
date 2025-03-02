public class Java45 {
    public static void main(String[] args)
    {
        Producer45 p1 = new Producer45("P1","Japan");
        Producer45 p2 = new Producer45("P2","USA");
        Producer45 p3 = new Producer45("P3","England");

        Vehicle v1 = new Plane(p1,"Jet A");
        Vehicle v2 = new Car(p2,"A95");
        Vehicle v3 = new Bicycle(p3);

        System.out.println("Plane");
        System.out.println("Producer: "+v1.printProducer());
        System.out.println("Speed: "+v1.Speed());

        System.out.println("----------------");
        System.out.println("Car");
        System.out.println("Producer: "+v2.printProducer());
        System.out.println("Speed: "+v3.Speed());

        System.out.println("----------------");
        System.out.println("Bicycle");
        System.out.println("Producer: "+v3.printProducer());
        System.out.println("Speed: "+v3.Speed());
    }
}

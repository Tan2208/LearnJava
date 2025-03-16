package main;

public class TestBox {
    public static void main(String[] args) {
        Box box=new Box(15);
        System.out.println("Value: "+box.getValue());

        Box box2=new Box<String>("Hello");
        System.out.println("Value: "+box2.getValue());

        Box box3= new Box<Double>(2.5);
        System.out.println("Value: "+box3.getValue());
    }
}

public class Java44 {
    public static void main(String[] args)
    {
        Coordinate c1 =new Coordinate(5,8);
        Coordinate c2 =new Coordinate(2,4);
        Coordinate c3 =new Coordinate(15,7);

        Form f1 = new Circle(c1,5);
        Form f2 =new Square(c2,3,5);
        Form f3 = new Point(c3);

        System.out.println("Area of Circle: "+f1.Area());
        System.out.println("Area of Square: "+f2.Area());
        System.out.println("Area of Point: "+f3.Area());

    }
}

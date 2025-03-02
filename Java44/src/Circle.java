public class Circle extends Form{
    private double radius;

    public Circle(Coordinate coordinate, double radius) {
        super(coordinate);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
        return Math.PI*this.radius*this.radius;
    }
}

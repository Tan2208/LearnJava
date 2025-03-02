public class Square extends Form{
    private double width,length;

    public Square(Coordinate coordinate, double width, double length) {
        super(coordinate);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double Area() {
        return this.width*this.length;
    }
}

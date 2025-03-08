public class Casio570FX  implements CalculatorInterface{
    @Override
    public double sum(double a, double b) {
        return a+b;
    }

    @Override
    public double sub(double a, double b) {
        return a-b;
    }

    @Override
    public double mul(double a, double b) {
        return a*b;
    }

    @Override
    public double div(double a, double b) {
        return a/b;
    }
}

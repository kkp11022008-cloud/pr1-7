package pr7;

public class MathFunc implements MathCalculable {

    @Override
    public double pow(double number, int power) {
        return Math.pow(number, power);
    }

    @Override
    public double absComplex(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double circumference(double radius) {
        return 2 * PI * radius;
    }
}

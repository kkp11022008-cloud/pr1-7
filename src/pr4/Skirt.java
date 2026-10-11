package pr4;

public class Skirt extends Cloth implements WomenCloth {

    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка: " + this);
    }
}
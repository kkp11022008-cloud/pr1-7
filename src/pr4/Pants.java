package pr4;

public class Pants extends Cloth
        implements MenCloth, WomenCloth {

    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужские брюки: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские брюки: " + this);
    }
}
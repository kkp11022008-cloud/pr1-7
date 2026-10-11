package pr4;

public class Tshirt extends Cloth
        implements MenCloth, WomenCloth {

    public Tshirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужская футболка: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: " + this);
    }
}
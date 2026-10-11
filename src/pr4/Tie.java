package pr4;

public class Tie extends Cloth implements MenCloth {

    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Галстук: " + this);
    }
}
package pr4;

public abstract class Cloth {

    protected Size size;
    protected double cost;
    protected String color;

    public Cloth(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "размер " + size
                + " (евроразмер " + size.getEuroSize() + ")"
                + ", " + size.getDescription()
                + ", цена " + cost + " руб."
                + ", цвет " + color;
    }
}
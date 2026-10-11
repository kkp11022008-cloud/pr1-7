package pr2.n4;

public class Computer {
    private String proizvod;
    private String model;
    private double price;
    public Computer(String proizvod, String model, double price) {
        this.proizvod = proizvod;
        this.model = model;
        this.price = price;
    }
    public String getModel() {
        return model;
    }
    @Override
    public String toString() {
        return "Производитель: " + proizvod + ", модель: " + model + ", цена: " + price;
    }
}
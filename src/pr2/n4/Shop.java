package pr2.n4;

public class Shop {
    private Computer[] computers;
    private int count;
    public Shop(int capacity) {
        computers = new Computer[capacity];
        count = 0;
    }
    public boolean addComputer(Computer computer) {
        if (count >= computers.length) {
            return false;
        }
        computers[count] = computer;
        count++;
        return true;
    }
    public Computer findComputer(String model) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getModel().equalsIgnoreCase(model)) {
                return computers[i];
            }
        }
        return null;
    }
    public boolean removeComputer(String model) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getModel().equalsIgnoreCase(model)) {
                for (int j = i; j < count - 1; j++) {
                    computers[j] = computers[j + 1];
                }
                computers[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }
    public void printComputers() {
        if (count == 0) {
            System.out.println("Магазин пуст");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + computers[i]);
        }
    }
}
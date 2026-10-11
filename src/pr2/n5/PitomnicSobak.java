package pr2.n5;

public class PitomnicSobak {
    private Dog[] dogs;
    private int count;
    public PitomnicSobak(int capacity) {
        dogs = new Dog[capacity];
        count = 0;
    }
    public void addDog(Dog dog) {
        if (count < dogs.length) {
            dogs[count] = dog;
            count++;
        } else {
            System.out.println("Массив собак заполнен.");
        }
    }
    public void printDogs() {
        for (int i = 0; i < count; i++) {
            System.out.println(dogs[i]);
        }
    }
    public static void main(String[] args) {
        PitomnicSobak kennel = new PitomnicSobak(3);
        Dog dog1 = new Dog("Шарик", 3);
        Dog dog2 = new Dog("Бобик", 5);
        Dog dog3 = new Dog("Рекс", 2);
        kennel.addDog(dog1);
        kennel.addDog(dog2);
        kennel.addDog(dog3);
        kennel.printDogs();
    }
}
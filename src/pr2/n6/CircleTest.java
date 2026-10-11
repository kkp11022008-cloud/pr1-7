package pr2.n6;

public class CircleTest {
    public static void main(String[] args) {
        Circle Circle1 = new Circle(0.0, 0.0, 5.0);
        Circle Circle = new Circle(3.0, 4.0, 3.0);
        System.out.println("Первая окружность:");
        System.out.println(Circle1);
        System.out.println("Вторая окружность:");
        System.out.println(Circle);

        System.out.println("Радиус первой окружности: " + Circle1.getRadius());
        System.out.println("Площадь первой окружности: " + Circle1.getArea());
        System.out.println("Длина первой окружности: " + Circle1.getLength());

        System.out.println(Circle1.compareSize(Circle));
    }
}
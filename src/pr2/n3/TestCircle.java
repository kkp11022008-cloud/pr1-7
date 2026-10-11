package pr2.n3;

public class TestCircle {
    public static void main(String[] args) {
        Tester tester = new Tester(3);
        Circle circle1 = new Circle(10.0, 5.0, 20.0);
        Circle circle2 = new Circle(30.0, 15.0, 10.0);
        Circle circle3 = new Circle(50.0, 25.0, 5.0);
        tester.addCircle(circle1);
        tester.addCircle(circle2);
        tester.addCircle(circle3);
        tester.printCircles();
    }
}
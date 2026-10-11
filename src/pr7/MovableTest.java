package pr7;

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(2, 3, 2, 2);
        MovablePoint point2 = new MovablePoint(8, 7, 2, 2);

        MovableRectangle rectangle =
                new MovableRectangle(point1, point2);

        System.out.println("Прямоугольник:");
        System.out.println(rectangle);

        System.out.println("Скорости одинаковые: "
                + rectangle.SpeedTest());

        rectangle.moveRight();

        System.out.println("После движения вправо:");
        System.out.println(rectangle);

        MovablePoint point3 = new MovablePoint(1, 1, 1, 2);
        MovablePoint point4 = new MovablePoint(5, 5, 3, 2);

        MovableRectangle rectangle2 =
                new MovableRectangle(point3, point4);

        System.out.println("У второго прямоугольника скорости одинаковые: "
                + rectangle2.SpeedTest());
    }
}